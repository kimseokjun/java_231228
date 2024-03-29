package b_Chapter01;

// 데이터 : 세계에 존재하는 정보를 총칭(컴퓨터의 저장 장치에 기록하는 정보)
// 컴퓨터는 기계어를 통해 데이터를 인식하고 처리

// 변수 : 데이터를 저장할 수 있는 메모리 공간

// 변수 선언
// 메모리 공간을 생성

// 변수 선언 방법
// : 데이터타입 변수명;

// 변수를 초기화
// : 변수에 데이터를 넣는 것
// : 변수명 = 데이터값;
// : 프로그래밍에서 '=' 는 '우항의 값을 좌항에 대입'하겠다는 의미
// : 프로그래밍에서 '같다'는 '==' 를 사용

// 변수 선언과 동시에 초기화가 가능
// : 데이터타입 변수명 = 데이터 값;

// 변수 명명 규칙
// : 문자, 숫자, 기호를 사용
// : 대소문자가 구분되고, 길이에 제한이 없다.
// : 숫자로 시작할 수 없다.
// : 기호는 _ , $ 만 가능하다. 기호로 시작 가능
// : 카멜게이스를 사용, 소문자로 시작
// : 전체 대문자 사용을 지양(사용x) : 상수와 구분하기 위함
// : 자바의 예약어, 키워드는 변수명으로 사용 X
		


// 상수 (Contant)
// : 프로그램 실행 동안 그 값이 변경되지 않는 값
// : 선언과 동시에 반드시 초기화가 이루어져야 함

// 상수의 선언 및 초기화
// : 자바에서는 final 키워드를 사용하여 상수를 선언
// : final 데이터타임 상수명 = 데이터 값;

// 상수의 특징
// : 초기화 이후에는 값을 변경 할 수 없다.
// : 보통 대문자로 명명
// : 일반적으로 공개된 값이나 변경되지 않는 값들을 정의할 때 사용


// 상수 명명 규칙
// : 전체 대문자로 명명을 권장
// : 스네이크 케이스를 사용(단어와 단어 사이를 _로 구분)









public class A_Variable {

	public static void main(String[] args) {

		int a = 101;
		double b = 10.1;
		char c = 'a';
		String d = "kk";
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

	}

}
