package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @GetMapping("/tests")
    public void test() {
        String s = check();
        System.out.println("hello world");
    }

    public String check() {
        System.out.println("check");
        return "success";
    }

    @GetMapping("/latest")
    public void test1() {
        String s = check();
        System.out.println("hello world");
    }
}
