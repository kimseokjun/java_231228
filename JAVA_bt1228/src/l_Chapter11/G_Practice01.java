package l_Chapter11;

// 내부 클래스 복습
// 비정적 내부 클래스 생성 : 외부 클래스(Animal), 내부 클리스(Heart)
// 외부 클래스 : private 필드 값(나이)
// 내부 클래스 : 메서드 ( 심작박동, beat) -출력( 외부 클래스의 필드 값을 가져옴)
class Animal{
	private int age = 0;
	class Heart{
		void beat() {
			System.out.println(Animal.this.age + "years old");
		}
	}
}


// 2. 정적 내부 클래스 생성 : 외부(Car), 내부(Engine)

class Car{
	
	private static String model = "Sonata";
	static class Engine{
		void Start() {
			System.out.println(model);
		}
	}
}
// 외부 클래스 : private 필드값 (모델, model)
// 내부 클래스 : 메서드( 출발, start) - 출력(외부 클래스의 필드값을 기져옴)

public class G_Practice01 {
	public static void main(String[] args) {
		
		// 비정적 내부 클래스
		//beat 메서드 호출
		Animal animal = new Animal();
		Animal.Heart heart = animal.new Heart();
		
		heart.beat();
		//정적 내부 클래스
		// start 메서드 호출
		
		Car.Engine engine = new Car.Engine();
		engine.Start();
	}
}
