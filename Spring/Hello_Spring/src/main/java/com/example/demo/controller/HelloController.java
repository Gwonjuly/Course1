package com.example.demo.controller;//controller=패키지 이름

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {//패키지 controller 안의 클래스 HelloController

    @GetMapping("hello") //web에서 /hello가 들어오면 이 매서드 호출 ex)localhost:8080/hello, get/post 방식
    public String hello(Model model){
       model.addAttribute("data", "hello!!");//키는 data, 값은 hello!!
       return "hello";//resources/templates/hello
    }

    @GetMapping("hello-mvc")
    public String hellomvc(@RequestParam("name") String name, Model model){//주소에서 hello-mvc?name=권주리
        model.addAttribute("name", name); //"name": 키, name: 웹에서 입력받을 값(String name)
        return "hello_template"; //resources/templates/hello_template
    }

    @GetMapping("hello_String")
    @ResponseBody
    public String helloString(@RequestParam("name") String name){
        return "hello" + name; //view 없이 웹에서 입력받은 값을 그대로  전달, 페이지 소스 보기 시, http 형식이 아닌 string 형식
    }

    @GetMapping("hello_api")
    @ResponseBody
    public Hello helloAPI(@RequestParam("name") String name){//Hello라는 객체 생성
        Hello hello=new Hello();
        hello.setName(name);
        return hello;
    }

    static class Hello{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
