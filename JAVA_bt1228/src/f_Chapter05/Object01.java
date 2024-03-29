package f_Chapter05;

// 객체 지향 프로그래밍의 변수

// 객체의 속성을 변수로 표현
// 객체의 상태를 저장

// 필드, 지역 변수 차이
// 1. 필드 : 객체의 지속적인 상태를 저장하는 클래스 내부의 변수
// 2. 지역변수 : 메서드가 실행되는 동안에만 존재하는 일시적인 변수

// 인스턴스 변수
/// 클래스의 각 객체에 속한 변수, 각 객체마다 독립적인 값을 가짐
// 클래스 내부에서 선언,, 객체가 생성될 떄 메모리에 할당

// 인스턴스 변수의 특징
// 각 객체에 대한 고유한 값을 가짐
// 캡슐화와 정보 은닉을 통해 보안을 유지.
// 메서드를 통해서만 접근하고 변경을 원칙


// 정적변수
// static 키워드를 이용하여 선언되는변수
// 클래스의 모든 인스턴스에서 공유되는 데이터

// 정적 변수의 특징
// 인스턴스가 아닌 전체 클레스에 포함, 모든 인스턴스에서 공유되는 하나의 데이터 값
// 프로그램이 시작할 떄 생성, 프로그램이 종료될 떄 소멸(메모리에 할당)

class Car{
	//인스턴스 변수
	//필드
	String color;
	int speed;
	String brand;
	
	// 속도를 증가시키는 메서드
	void accelerate(int increment) {
		speed += increment;
	}
	
	void displayInfo()
	{
		System.out.println(speed);
	}
}

class Dog{
	// 인스턴스 변수
	private String name;
	private int age;
	
	Dog(String name, int age){
		this.name  = name;
		this.age = age;
	}
	
}

class Student{
	// 클래스 변수의 경우 변수 선언 맨 처음에 static 키워드로 정의
	// 모든 객체에 값은 값
	static String schoolName;
	
	// 인스턴스 변수
	// 객체 마다 부여되는 값
	String name;
	int studentNumber;
}
public class Object01 {
	public static void main(String[] args) {
	Car car1 = new Car();
	car1.color = "white";
	car1.speed = 0;
	car1.brand = "Hyundai";
	
	car1.displayInfo();
	car1.accelerate(50);
	car1.displayInfo();
	System.out.println("=========================");
	
	Dog dog1 = new Dog("bori",3);
	
	// 인스턴스 변수를 private하게 접근을 제어 ->외부에서는 접근이 불가능하다.
	//dog1.age = 5;
	//정적변수
	//클래스 이름을 통해 직접 접근 가능 - 객체 생성 전에 호출 가능
	Student.schoolName = "A";
	System.out.println(Student.schoolName);
	
	Student student01 = new Student();
	student01.name = "김석준";
	student01.studentNumber = 13;
	
	
	// 클래스 변수는 인스턴스 변수에 할당되어 사용할 수 X
	// 클래스 변수는 항상 클래스명으로 호출되어야 함
	}
}
