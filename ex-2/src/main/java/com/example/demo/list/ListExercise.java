package com.example.demo.list;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		
		names.add("홍길동");
		names.add("홍길동22");
		names.add("홍길동333");
		
		for(String name:names) {
			System.out.println(name);
		}
	}
}

/*
 * main함수가 있으므로 자체 실행 확인이 가능함
*/