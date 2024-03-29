package j_Chapter09;


//다형성
// Animal, Cat, Dog 클래스
class Animal {
	void sound() {
		System.out.println("The animal makes a sound");
	}
}

class Cat extends Animal{
	@Override
	void sound() {
		System.out.println("meow");
	}
}
class Dog extends Animal{
	@Override
	void sound() {
		System.out.println("bark");
	}
}
// Animal 클래스 : sound 메서드
// Cat, Dog 클래스 - Animal 클래스를 상속 받음
// : sound 클래스를 오버라이딩 >> 각각 "meow" , "bark" 출력


// instanceof 연산자
// : Animal, Cat, Dog 클래스를 사용하여 다형성을 확인하는 메서드 작성
// : checkAnimalType 메서드 - Animal 타입의 매개변수를 전달
// : instanceof 연산자를 사용하여 매개변수가 Cat과 Dog 중 어느 인스턴스인지
// : Cat 이면 'cat'출력 / Dog 면 'dog'출력 / 둘다 X 'Unkown animal type' 출력
class AnimalChecker{
	void checkAnimalType(Animal animal) {
		
	}
}
public class Z_Practice01 {
	public static void main(String[] args) {
		
		Animal animal = new Animal();
		Animal cat1 = new Cat();
		Animal dog1 = new Dog();
		//Animal, Cat, Dog 클래스의 객체 Animal 타입으로 저장
		// 생성된 각 객체를 checkAnimalType 메서드를 사용하여 확인
		cat1.sound();
		dog1.sound();
	}
}
