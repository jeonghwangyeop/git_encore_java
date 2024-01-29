package com.encore.test;
// 인터프리트가 되지 않는다. 이렇게 실행되지 않는 클래스를 만드는 이유
/*
 *  	// Single line Comment
 *  
 *  	XXXXVO,java, XXXXDTO.java, XXXXEntity.java / 셋 다 동일한 역할을 한다.
 *  	-- 업무 로직이 없고 데이터만 관리하는 클래스로 변수 및 Setter, Getter
 *  	-- private 접근지정자를 사용함(데이터는 critical한 것, 은닉화를 위해 private로 잠궈버리는 것).
 *  	-- 외부에서의 접근만 block하지, 내부에서는 언제든지 자유롭게 접근 가능.
 */
public class StudentVO { // VO : Value Object
	/*
	 *		변수(Variable)
	 *		구문 형식 : 접근지정자 변수 타입 변수명 ; 
	 *		-- 접근지정자(public, private)
	 *		-- 변수 타입(기본타입, 참조타입)
	 *		... byte, int, long, short, double, float, boolean 빼고는 다 참조타입.
	 *		-- 변수명(소문자로 시작)
	 *		변수란 선언 위치가 있다(전역, 지역).
	 */
	// 전역 변수 : (클래스내에서 접근가능한 범위를 갖는 것. Class Inside, Method Outside)
	// 전역 변수는 국회의원, 지역변수는 도의원/시의원
	// 전역 변수를 public으로 열어주는 경우는 없다(악의적인 값의 접근을 막기 위해).
	private String	name		;	//참조타입이면서 기본타입처럼 쓸 수 있는 유일한 변수 타입.
	private int		age			;
	private double	height		;
	private boolean	isMarriage	;
	/*
	 * 생성자
	 * 매개변수가 없는 생성자는 기본 생성자
	 * 매개변수가 있는 생성자는 Special Constuctor
	 * 명시적으로 생성자가 정의되지 않으면, 컴파일 시점에 기본 생성자를 넣어서 컴파일 진행.
	 * 
	 * 구문형식 : 
	 * 접근지정자 클래스이름([매개변수]){ // 클래스이름부가 대소문자까지 일치해야 한다.
	 * 
	 * }
	 */
	
	// 클래스의 구성요소는 변수 뿐만 아니라, 메서드(함수) 또힌 담을 수 있다.
	/*
	 * 메서드(함수)
	 * 구문 형식 :
	 * 만약, 반환타입이 void가 아니라면, 문장이 끝나기 전에 return 키워드를 이용하여 값을 반환.
	 * 
	 * 접근지정자 반환타임 메서드이름([매개변수]){	// 매개변수도 지역변수로 본다.
	 * 		문장;
	 * 		return (기본값 | 참조값)
	 * }
	 */
	
	// private로 막혀있기 때문에 set/get을 통해 값에 접근.
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public boolean isMarriage() {
		return isMarriage;
	}
	public void setMarriage(boolean isMarriage) {
		this.isMarriage = isMarriage;
	}
	
}
