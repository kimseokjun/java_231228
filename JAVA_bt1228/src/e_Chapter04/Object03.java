package e_Chapter04;

// 클래스의 구조
// 필드, 메서드, 생성자

class Car{
	// 클래스의 속성
	String model = null;
	int year = 0;
	// 클래스의 행동(메서드)
	// 클래스 내에서 정의도니 함수. 객체의 행동을 표현 
	// 클래스의 데이터를 사용하여 특정 작업을 수행하거나, 값을 반환할수 있다.
	
	public void disPlayInfo() {
		System.out.println("Model : "+ model + ", Year : " + year);
	}
	//클래스의 생성자
	// 클래스 이름과 동일, 객체가 생성될 때 자동으로 호출
	// 필요한 초기화 작업을 수행하거나, 객체 생성시 필요한 데이터를 전달
	Car(String model, int year){
		this.model = model;
		this.year = year;
	}

	
}
public class Object03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car("S",1);
		
		car1.disPlayInfo();
	}

}
