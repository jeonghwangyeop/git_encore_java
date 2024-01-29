package com.encore.car.engine;

public class Engine {
	
	private String engineType;
	
	// 생성자 또는 메서드는 매개변수의 타입과 개수를 달리 해서 재 정의할 수 있다.
	// 생성자 오버로딩, 메서드 오버로딩
	public Engine() {
	}
	
	// 생성자에 인자가 들어온다? 클래스가 전역변수로 선언되어있는 멤버변수를 초기화.
	// 생성자는 매개변수로 받은 값을 전역(멤버)변수에 할당하는 역할을 한다.
	// 따라서 현업에서 멤버변수는 선언만 되어있고, 할당은 생성자를 통해.
	public Engine(String engineType) {	// 멤버변수와 지역변수의 이름이 같을 때, 메서드 내에서 지역변수가 우선권을 갖는다.
		this.engineType=engineType;		// 선언 위치만 다르면 이름 같아도 사용하는 데에 문법적 에러는 없다.
	}	// this 는 인스턴스가 소유하는 멤버변수임을 의미함.
	
	
	public String showInfo() {
		return "엔진의 타입은 "+engineType+"입니다.";
	}
}
