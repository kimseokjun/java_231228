package h_Chatper07;


//사람 클래스(Person)
class Person{
	String name = null;
	int age  =0;
	
	Person()
	{};
	Person(String name, int age)
	{
		this.name = name;
		this.age = age;		
	}
	
	Person(String name){
		this.name = name;
		this.age = 0;
	}
	
	void displayInfo()
	{
		System.out.println("Name : " + name + " Age : " + age);
	}
}
// 인스턴스 변수(name, age)

// 기본생성자 - 인스턴스 변수 초기화( 매개변수 X - 기본값)

// 매개변수가 있는 생성자- 오버로딩( 각각의 인스턴수 변수값을 매개변수로 전달)

// 매개변수가 있는 생성자 - 오버로딩(이름만 매개 변수로 전달받아 초기화, 나이는 0)

// 메서드(반환X, 매개변수 X) - 사람의 정보를 출력
// Name : 이름, Age: 나이


public class Z_Practice {

	public static void main(String[] args) {
		
		//사람 인스턴스 3명 생성
		// 각각 다른 생성자로 생성, 각 인스턴스에 대한 메서드 호출
		Person person1 = new Person();
		Person person2 = new Person("KSJ",24);
		Person person3= new Person("KSJ");

		person1.displayInfo();
		person2.displayInfo();
		person3.displayInfo();
	}

}
