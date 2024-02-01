package com.example.demo.repository;

import com.example.demo.domain.Member;

import java.util.*;

public class MemoryMemberRepository implements MemberRepository{//빨간 줄 뜨면 alt+enter
    //아래 code 두 줄 동시성 문제가 일어날 수 있는 코드임 pdf 참조
    private static Map<Long,Member> store = new HashMap<>();//Map, HashMap 다 클래스임, 저장소(메모리)이기에 공유자원 static형
    //음.. 쉽게 말하면 c++의 vector<int> v; java의 vector<integer> v;
    //c++의 v.pushback();
    private static long sequence=0L;

    @Override
    public Member save(Member member) {//이때 member.name은 넘어옴(회원가입 시 입력),
        member.setId(++sequence);//이름에 대응하는 id 생성=member.id 생성
        store.put(member.getId(),member);//Map store에 (id,member(이름)) mapping
        return member;
    }
     /*
        [put]
        V put(K key, V value) : 해당 맵에 전달된 키에 대응하는 값으로 특정 값을 매핑함.
         */

    @Override
    public Optional<Member> findById(Long id) {
        return Optional.ofNullable(store.get(id));//store.get(id)가 아닌 이렇게 하면 클라이언트에서 null 값이 들어와도 대응 가능
    }
    /*
    [get]
    V get(Object key) : 해당 맵에서 전달된 키에 대응하는 값을 반환함. 키에 대응하는 값이 없으면 null 반환
     */

    @Override
    public Optional<Member> findByName(String name) {
        return store.values().stream()//람다식으로 store의 value 무한루프
                .filter(member -> member.getName().equals(name))//member에서 getname과 param name이 같으면 필터링
                .findAny();//찾으면 반환, 없으면 null로 감싸서 반환
    }
    /*
    위의 member는 store.values() 같음. ex) for문의 int i
     */

    @Override
    public List<Member> findAll() {
        return new ArrayList<>(store.values());//store가 map이기에 list로 변환하여 반환
    }
}
/*
ArrayList<>은 List<> 인터페이스를 구현한 하나의 클래스입니다.
List<String> myList = new ArrayList<>();
myList는 List<> 인터페이스의 객체이지만, 구현체는 ArrayList<>입니다.
 */
