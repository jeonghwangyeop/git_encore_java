
public class EncoreMain {
	
	// byte=>short=>int=>long=>float=>double (묵시적 형변환)
	//		  char=>int로 자동 promotion.
	// byte<=short<=int<=long<=float<=double (명시적 형변환)
	// 명시적 형변환(캐스팅)
	
	public static void main(String[] args) { // 메인도 메서드!
		// TODO Auto-generated method stub
		System.out.println("섭섭님과 함께 하는 즐거운 JAVA");
		// 지역 변수는 메서드 내에 선언하는 변수
		// 지역 변수 선언시 접근지정자가 빠진다.
		long	intValue		= 10	; // int(4byte)를 long(8byte)로 바꾸어도 문제가 발생하지 않는다.
		char	charValue		= 'F'	;
		float	doubleValue		= 3.14F	; // double(8byte)를 float(4byte)로 바꾸면 문제가 발생한다.
		String	stringValue		= "섭섭님";
		boolean	booleanValue	= false	;
		
		System.out.println("정수값	: " + intValue)		;	// 데이터 타입이 큰 타입으로 흡수, +는 연결연산자로서의 역할.
		System.out.println("문자값	: " + charValue)	;
		System.out.println("실수값	: " + doubleValue)	;
		System.out.println("문자열값	: " + stringValue)	;
		System.out.println("논리값	: " + booleanValue)	;
	}

}

