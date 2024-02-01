package com.example.demo.service;

import com.example.demo.domain.Member;
import com.example.demo.repository.MemberRepository;
import com.example.demo.repository.MemoryMemberRepository;

import java.util.Optional;

public class MemberService {
    /*
    구현 클래스가 작성되면 new 연산자로 객체를 생성할 수 있다.
    인터페이스로 구현 객체를 사용하려면 다음과 같이 인터페이스 변수를 선언하고 구현 객체를 대입해야 한다.
     */
    private final MemberRepository memberRepository=new MemoryMemberRepository();

    public Long join(Member member){
        //같은 이름의 중복회원 X
        Optional<Member> result=memberRepository.findByName(member.getName());//findbyname을 통해 반환된 값이 NULL이 아니면
        result.ifPresent(m-> {//이 로직 동작
            throw new IllegalStateException("이미 존재하는 회원입니다.");
        });

        memberRepository.save(member);
        return member.getId();
    }
}
