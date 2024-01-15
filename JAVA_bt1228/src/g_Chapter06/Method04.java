package g_Chapter06;

// 정적 메서드
// : 메서드 앞에 static을 붙이는 경우 클래스(정적) 메서드로 생성 가능
// : 객체를 생성하지 않고도 클래스명으로 호출 가능

// 인스턴스 변수와 관계없는 메서드를 클래스 메서드로 정의
// 인스턴스 변수는 객체를 생성해야만 사용 가능

// static
// 1. 클래스 설계 시, 변수(속성) 중 모든 인스턴스가 공통적으로 사용하는 값
// 2. 클래스 변수는 인스턴스 생성 없이도 사용가능
// 3. 클래스 메서드는 인스턴스 변수를 사용할 수 없다.
// - 클래스 메서드 내에서 인스턴스 변수 호출(사용) X
// 4. 메서드 내에서 인스터스 변수를 사용하지 X, static을 붙이는 것을 고려






class Operator {
	// 인스턴스 변수
	int a, b;

	// 인스턴스 메서드 : 인스턴스 변수인 a,b가 필요한 작업 , 매개변수 없어도 됌.
	int add() {
		return a + b;
	}

	int sub() {
		return a - b;
	}

	int multi() {
		return a * b;
	}

	double div() {
		return a / b;
	}

	// 정적 메서드 : 인스턴스 변수와 관계없이 매개변수만으로 작업 가능
	static int add(int a, int b) {
		return a + b;
	}

	static int sub(int a, int b) {
		return a - b;
	}

	static int multi(int a, int b) {
		return a * b;
	}

	static double div(int a, int b) {
		return a / b;
	}

}

public class Method04 {

	public static void main(String[] args) {

		System.out.println("========정적 메서드==============");
		System.out.println(Operator.add(30, 40));
		System.out.println(Operator.sub(30, 40));
		System.out.println(Operator.multi(30, 40));
		System.out.println(Operator.div(30, 40));

		System.out.println("========인스턴스 메서드==============");

		Operator op1 = new Operator();
		op1.a = 10;
		op1.b = 5;

		System.out.println(op1.add());
		System.out.println(op1.sub());
		System.out.println(op1.multi());
		System.out.println(op1.div());

	}

}
