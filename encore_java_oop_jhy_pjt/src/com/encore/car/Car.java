package com.encore.car;

import com.encore.car.engine.Engine;

public class Car {
	// 전역 (멤버) 변수 스코프는 클래스 전역에서 사용가능한 변수.
	private	Engine engine;	// 변수 선언.
	
	// 기본 생성자 정의
	// 생성자는 like-a-method(메서드처럼 생겼으나, 메서드 아님.) 로 반환타입이 정의되지 않고, 메서드의 이름을 클래스의 이름과 동일하다.
	// 생성자는 객체 생성시 호출하게 되어 있음.
	public	Car() {
		engine = new Engine();
	}
	
	public Car(String type) {
		engine = new Engine(type);
	}
	
	public void engineInfo() {
		String info = engine.showInfo();
		System.out.println(">>>> 엔진 정보 <<<<");
		System.out.println(info);
	}
}
