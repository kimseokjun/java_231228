package b_Chapter01;

//자바의 연산자
// : 산술 연산자, 대입 연산자, 비교 연산자, 논리 연산자, 삼항 연산자

public class E_Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. 산술 연산자

		// 덧셈 연산자 (+): 좌항에 우항을 더한 값을 반환
		int addResult = 8 + 3;

		// 뺄셈 연산자 (-): 좌항에 우항을 뺀 값을 반환
		int minusResult = 8 - 3;

		// 곱셈 연산자 (*): 좌항에 우항을 곱한 값을 반환
		int multiResult = 8 * 3;

		// 나눗셈 연산자 (/): 좌항에 우항을 나눈 값을 반환
		int divResult = 8 / 3;

		System.out.println(addResult);
		System.out.println(minusResult);
		System.out.println(multiResult);
		System.out.println(divResult);

		// 나머지 연산자(%)

		// 8 = 3 * 2(몫) + 2(나머지)

		// 증감 연산자
		// 변수 그 자신에 1 증가 또는 감소
		// 상수에는 증감 연산자 사용 X

		int integer = 10;
		System.out.println(++integer); // 변수 명 앞에 증가 연산자를 사용 시 즉각 증가

		System.out.println(integer++); // 변수 명 뒤에 증가 연산자 사용 시 다음 호출시 증가
		System.out.println(integer);

		integer = 10;
		--integer; // 9
		System.out.println(integer);
		integer--; // 9
		System.out.println(integer); // 8

//		대입 연산자
//		- 우항의 값을 좌항에 대입한다
//		

//		= : 좌항에 우항을 대입
		int a = 100;

//		+= : 좌항에 우항을 더한 값을 좌항에 대입

		a += 10; // a = a+10; 110

//		-= : 좌항에 우항을 뺀 값을 좌항에 대입

		a -= 10; // a = a-10; 100

//		*= : 좌항에 우항을 곱한 값..
		a *= 2; // 200
//		/= : 좌항에 우항을 곱한 값..
		a /= 2; // 100
//		%= : 좌항에 우항을 나눈 나머지값 ..
		a %= 3; // 1

		System.out.println(a);

//		대입 연산자의 좌항에는 반드시 변수만 지정 가능
		
//		비교 연산자
//		좌항을 우항과 비교한 결과를 논리값 으로 반환
		
		
//		== 
//		좌항이 우항과 같다면 true, 아니면 false 반환
		
		boolean bool1 = 10 == 12;
		System.out.println(bool1);
		
//		!=
//		좌항이 우항과 다르다면 true 아니면 false
		boolean bool2 = 10 != 12;
		System.out.println(bool2);
		
//		> , >=
//		: 좌항이 우항보다 크면 true, 작으면 false
		
		boolean bool3 = 10 > 12;
		System.out.println(bool3);
		
		boolean bool4 = 10 >= 10;
		System.out.println(bool4);
		
//		<, <=
//		: 좌항이 우항보다 작으면 true, 크면 false
		
		boolean bool5 = 10 < 12;
		System.out.println(bool5);
		
//		줄복사 단축기 : Ctrl + Alt + 방향키	
		
		
//		논리연산자
//		논리 값을 연산하는 연산자
		
//		&& :  And 연산자 
//		좌항과 우항이 모두 만족하면 참, 하라나도 만족하지 못하면 거짓
		
		int Op1 = 10; int Op2 = 20;
		boolean AndBool = Op1 < Op2;
		
		System.out.println(AndBool && true);
		
//		|| : Or 연산자
//		좌항과 우항중 하나라도 만족하면 참, 둘다 만족하지 않을 때 거짓
		
		boolean OrBool1 = Op1 < Op2;
		boolean OrBool2 = Op1 > Op2;
		System.out.println(OrBool1 || false); //true || false => true
		System.out.println(OrBool2 || false); //false || false => false
		
//		! : (not)연산자		
//		논리값의 부정을 반환 하는 연산
		boolean notBool = false;
		System.out.println(!notBool); //!false => true
		
		
		
		
		
		
		
		
		
	}

}