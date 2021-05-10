/*Application클래스는 앞으로 만들 프로젝트의 메인클래스임*/
package com.practice.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 스프링부트의 자동 설정, Bean일기와 생성을 모두 자동으로 설정함.
// 특히 이 @SpringBootApplication의 위치부터 읽기 때문에 이 클래스는 항상 프로젝트 최상단에 위치해야함.
@SpringBootApplication
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}
