
public class CastingMain {

	public static void main(String[] args) {
		
		// JAVA의 캐스팅 연산자 : (타입)변수명
		
		// TODO Auto-generated method stub
		byte	x, y, sum;	// 선언
		
		x	= 10			;
		y	= 10			;
		sum	= (byte)(x+y)	;	// byte와 byte의 연산결과는 묵시적으로 기본형인 int로 저장됨. 이를 byte에 저장하려다보니 문제가 발생함.
		
		System.out.println("sum = " + sum);
		System.out.println();
		System.out.println();
		
		char	charValue	= 'A';
		char	charValue02	= 'B';
		System.out.println("char value = " + charValue)	;
		System.out.println(charValue+charValue02)		;
		System.out.println("==")						;
		System.out.println((char)(97))					;	// 문자와 문자를 더하는게 안되므로, 아스키코드끼리의 합을 출력하게 됨.
	}

}
