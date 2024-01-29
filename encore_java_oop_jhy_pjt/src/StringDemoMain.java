
public class StringDemoMain {
	public static void main(String[] args) {
		// JAVA에서 유일하게 참조타입이지만 기본타입처럼 사용가능한 변수의 타입은 String.
		// String 은 인스턴스 생성없이 사용가능하지만, 객체로 취급이 됨. String class 구성요소에 접근이 가능해짐.
		// 1. String 은 참조타입이지만, 기본타입처럼 쓸 수 있다.
		// 2. 문자열 비교시, ==연산자가 아닌, equals 라는 메서드를 사용하자.
		// String str01	= "임섭순";
		// St01ring str02	= "임섭순";	// 둘은 주소값과 값 모두 같게 나온다.
		
		String str01 = new String("임섭순");
		String str02 = new String("임섭순");
		
		if (str01 == str02) {		// 주소값을 비교하는 연산자 ... 같은 문자열을 가지고 있더라도, 서로 다른 객체이므로 주소값이 다르게 인식됨.
			System.out.println("주소값이 동일합니다.");
		} else {
			System.out.println("주소값이 동일하지 않습니다.");
		}
		
		if (str01.equals(str02)) {	// 값을 비교하는 연산자
			System.out.println("값이 동일합니다.");
		} else {
			System.out.println("값이 동일하지 않습니다.");
		}
	}
}
