package com.example.demo;

/*
 * 클래스를 Bean으로 등록
 * @Component, @Controller, @Service, @Repository
*/
public class EveningGreet implements Greet {

	@Override
	public void greeting() {
		System.out.println("시원한 저녁");
	}

}
