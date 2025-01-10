package com.example.demo;

import java.beans.JavaBean;

import org.springframework.stereotype.Component;

/*
 * 클래스를 Bean으로 등록
 * @Component, @Controller, @Service, @Repository
*/
@Component
public class MorningGreet implements Greet {

	@Override
	public void greeting() {
		System.out.println("좋은 아침");
	}

}
