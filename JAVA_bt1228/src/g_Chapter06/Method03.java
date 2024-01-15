package g_Chapter06;

// 사칙연산 클래스

class MyMath {
	int add(int a, int b) {
		return a + b;
	}

	int sub(int a, int b) {
		return a - b;
	}

	int multi(int a, int b) {
		return a * b;
	}

	double div(int a, int b) {
		return a / b;
	}
	// return 문
	// : 현재 실행중인 메서드를 종료하고 호출한 메서드로 돌아감
	// : 반환값이 유무에 관게없이 모든 메서드에는 적어도 하나 이상의 return 문이 존재해야한다/
	// : 자바 컴파일러가 메서드의 마지막에 자동으로 return; 을 추가 => void에 리턴을 쓰지 않은 이유

	void noReturn() {
		System.out.println("해당 메서드는 반환값이 없습니다.");
		return;// 반환타입이 void 이기 떄문에 생략가능 - 컴파일러가 자동 추가해부는 부분
	}

	// 반환값이 있는 메서드

	String yesReturn() {
		String message = "해당 메서드는 반환값이 있습니다.";
		// 반환타입이 void가 아닌 경우 return문 작성을 생략시 오류 발생
		return message;
	}

	int max(int a, int b) // 항상 결과값이 반환되도록 지정 else를 사용해줘야한다.
	{
		if( a> b)
		{
			return a;
		}
		else if( a<b)
		{
			return b;
		}
		else {
			return a; 
		}
		
	}

	// 반환값
	// : 주로 계산한 결과를 변수에 저장하여 변수를 반환하는 경우가 많다. return value;
	// : 수식 자체를 반환하는 것도 가능 return x+y;

	
	// 조건문
	// 조건에 따른 반환의 명료한 작성
	// if - else문
	// 조건에 따른 코드 실행 여부를 제어
	
	
	// 삼항 연산자
	// 조건 ? 조건이 참인 경우 : 조건이 거짓인 경우
	int min(int a, int b) {
		return a > b ? b: a;
	}
}

public class Method03 {

	public static void main(String[] args) {

		MyMath mm = new MyMath();
		// 메서드의 실행 흐름
		// 1. main 메서드에서 메서드 add를 호출 - 인자를 매개변수에 전달
		// 2. 메서드 add 내에서 중괄호{} 구현부 내의 문장이 순서대로 수행
		// 3. 메서드 add의 모든 문장이 실행되거나 return을 만나면 , 호출된 메서드(main)으로 돌아와 이후 문장을 실행
		// 반환 값을 value에 할당
		// if 함수가 void 타임으로 바로 출력하는 경우 console창에 출력

		int value1 = mm.add(10, 20);
		int value2 = mm.sub(10, 20);
		int value3 = mm.multi(10, 20);
		double value4 = mm.div(5, 3);

		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);

		
	}

}
