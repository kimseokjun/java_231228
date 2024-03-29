package i_Chapter08;


// 캡슐화
// : 객체 지향 프로그래밍에서 데이터와 해당 데이터를 처리하는 함수를 하나로 묶는 것
// - 객체 내부의 구현을 숨기고 외부에서는 제공된 메서드를 통해서만 접근할 수 있도록 함
// - 데이터 보호, 유지보수성 향상, 사용의 편의성 증대

//getter & setter 메서드
// - 캡슐화된 데이터에 안전하게 접근하고 수정할 수 있도록 하는 기능
//getter
// : 객체의 특정 필드 값을 읽을 수 있게 해주는 메서드

//setter
// : 객체의 특정 필드 값을 설정할 수 있게 해주는 메서드

class Student{
	// private 접근 제어
	private String name;
	private int age;
	private int score;
	
	
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		if(score>=0 && score <= 100)
		{
			this.score = score;
		}
		else {
			System.out.println("유효하지 않은 값입니다.");
		}
	}

	//getter & setter - 캡슐화되어있는 데이터에 접근
	public String getName() {
		// private 선언 되어있는 name변수는 반드시 getName 메서드를 통해서만
		// , 외부 클래스 또는 외부 패키지에서 접근이 가능
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
}
public class B_Encapsulation {
	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setName("김석준");
		student1.setAge(24);
		System.out.println(student1.getName());
		System.out.println(student1.getAge());
		student1.setScore(40);
		System.out.println(student1.getScore());
		
		student1.setScore(-1);
		System.out.println(student1.getScore());
	}
}
