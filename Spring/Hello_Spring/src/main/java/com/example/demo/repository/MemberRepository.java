package com.example.demo.repository;//package repository

import com.example.demo.domain.Member;

import java.util.List;
import java.util.Optional;
/*
인터페이스
- 객체 생성 불가
- 아래처럼 추상 메소드
- 인터페이스를 구현할 때, class 클래스 명 implements 인터페이스 명
- 쉽게 말해서 헤더파일처럼 생각하면 편한 듯
- chat gpt 참고
 */
public interface MemberRepository {//패키지 repository 안의 인터페이스 MemberRepository
    Member save(Member member);//이 메소드의 반환 유형은 클래스 Member의 인스턴스를 반환한다는 의미입니다.Member반환 값은 일반적으로 저장 작업 이후에 저장되거나 업데이트된 인스턴스를 나타냅니다.
    Optional<Member> findById(Long id);//반환되는 값이 NULL 일 수 있기에 Optional로 감쌈
    Optional<Member> findByName(String name);
    List<Member> findAll();//리스트 형식은 데이터의 집합(클래스 Member)가 변수(객체)로 들어올 수 있음
}
