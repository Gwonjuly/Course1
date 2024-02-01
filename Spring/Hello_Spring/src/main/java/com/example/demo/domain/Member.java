package com.example.demo.domain;
//비즈니스 도메인 객체, 예) 회원, 주문, 쿠폰 등등 주로 데이터베이스에 저장하고 관리
public class Member {
    private Long id;//시스템에서 자동으로 등록되는 id
    private String name;//회원가입 시 적는 이름
    //alt+insert=generate 단축키 ex) getter/setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
