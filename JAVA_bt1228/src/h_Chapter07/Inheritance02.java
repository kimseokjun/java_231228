package h_Chapter07;

// 상속에서의 생성자
// 상속 받은 클래스에서 생성자 호출 순서
// 부모-> 자식 순서로 진행

// 자식 클래스의 객체를 생성할 때, 자식 클래스는 자식 생성자를 통해 자식 객체를 생성

class Animal1{
	String name = "Parent";
	Animal1(){
		System.out.println("빈 생성자");
	}
	
	Animal1(String name)
	{
		this.name = name;
		System.out.println("부모클래스가 생성되었습니다.");
	}
}

class Cat extends Animal1{
	// 1. super() 참조 메서드
	// 자식 클래스 기본 생성자 사용자 정의하지 않더라도
	// ,super() 부모 클래스 생성자 호출 키워드가 정의되어 있음
	String name = "Child";
	// 2, super 참조 변수
	void greet() {
		System.out.println("Hello" + this.name);		//
		System.out.println("Hello" + super.name);	//부모클래스가 가진 인스턴스 변수에 접근(super키워드를 사용하여 접근)
	}
	Cat(){
		System.out.println("빈 생성자");
	}
	//자식 클래스의 기본생성자는 사용자가 정의하지 않더라도 
	// ,super()라고 하는 부모 클래스 생성자 호출 키워드가 정의되어 있음
	Cat(String name){
		// super()는 부모 클래스의 생성자를 가지고 오기 때문에 , 기본 생성자 또는 사용자 정의 생성자의 형태 그대로를 사용
		super(name);
		System.out.println("자식 클래스가 생성되었습니다.");
	}
}
public class Inheritance02 {
	public static void main(String[] args) {
		Cat voidCat = new Cat();
		Cat myCat = new Cat("choco");
		
		myCat.greet();
	}
}

//super
// : 자식 클래스에서 부모 클래스의 멤버(필드, 메서드) 에 접근할때 사용

// super()
// : 부모 클래스의 생성자를 호출하는데 사용