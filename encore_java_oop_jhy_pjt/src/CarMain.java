import com.encore.car.Car;

public class CarMain {
	
	public static void main(String[] args) {
		Car car = new Car("가솔린");	// main 에서 인스턴스를 1개만 생성했지만, 실질적으로는 car 와 engine 총 2개의 인스턴스가 생성됨.
		
		// Car 객체 생성 후, 인스턴스 소유의 메서드 호출.
		car.engineInfo();
		//
	}
}
