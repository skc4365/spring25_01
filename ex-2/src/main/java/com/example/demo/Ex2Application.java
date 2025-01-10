package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ex2Application {

	public static void main(String[] args) {
		SpringApplication.run(Ex2Application.class, args)
		.getBean(Ex2Application.class)
		.excute();
	}

	/*
	 * 의존성주입(필드,생성자,메소드)
	 * @Autowired
	*/	
	@Autowired
	Greet greet;
	
	private void excute() {
		
/*		스프링에서 컴포넌트 스캔을 통해 Bean으로 등록된 
 *      MorningGreet()을 실행한 결과가 출력  */
		greet.greeting();
		
//		자바에서 new키워드를 사용하여 새로운객체 생성
		new EveningGreet().greeting();
		
	}

}
