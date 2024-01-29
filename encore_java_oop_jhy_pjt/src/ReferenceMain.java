import com.encore.test.StudentVO;

public class ReferenceMain {
	/*
	 * 기본타입과 참조타입 차이점 :
	 * 기본타입은 선언과 동시에 값을 할당할 수 있다.
	 * 기본타입은 값을 담는 변수.
	 * 
	 * 그러나,
	 * 참조타입은 선언과 동시에 값을 할당할 수 없음.
	 * 참조타입은 값을 담는 변수가 아니라, 주소값을 담는 변수이다.
	 * 주소값을 담기 위해서는 객체 생성이 선행되어야 한다.
	 * 객체 생성시 사용하는 연산자는 new
	 * new 연산자 뒤에는 생성자(Constructor)를 호출하게 된다.
	 * 
	 * 참조타입 : 클래스, 배열, 자료구조, enum
	 */
	public static void main(String[] args) {	// main도 하나의 메서드. 접근지정자없어도 된다.
		
		StudentVO stuObj = new StudentVO();
		
//		접근제어자가 public일 때 가능한 코드.		
//		System.out.println("인스턴스 소유의 변수 호출 : " + stuObj.name);
//		stuObj.name="포케";
//		System.out.println("인스턴스 소유의 변수 호출 : " + stuObj.name);
//		
		System.out.println("인스턴스 소유의 메서드 호출 : ");
		stuObj.setName("섭섭해");
		String returnValue=stuObj.getName();
		System.out.println("인스턴스 소유의 메서드 호출 : " + returnValue);
	}
}
