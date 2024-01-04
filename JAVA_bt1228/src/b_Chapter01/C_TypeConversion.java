package b_Chapter01;

// 자바 형 변환

// - 하나의 타입을 다른 타입으로 바꾸는 것

// 자료형의 크기에 따른 형 변환 규칙
// byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)
// :메모리 설계 상 정수 타입보다 실수 타입이 더 크다

public class C_TypeConversion {

	public static void main(String[] args) {

		// 1. 자동 형 변환 (묵시적)
		// : 크기가 큰 자료형으로의 변환
		byte small_bowl = 10;
		int big_bowl = 10000;

		// 작은 범위의 타입을 큰 타입으로 넣을 때는
		// 자동으로 형 변환을 컴파일러가 수행
		big_bowl = small_bowl;

		byte a = 32; // 1 byte 자료형
		short b = a; // 1 byte 자료형에 저장된 값을 2byte 변환
		int c = b;
		long d = c;

		// 2. 강제 형 변환 (명시적)
		// : 크기가 작은 자료형으로의 변환
		int number = 1234;
		float float_number = number;

		float f = 3.14f;
		// int int_number =f; <- float 이 int보다 크기 때문에 자동형 변환이 일어나지 않는다.(값 손실이 난다.)

		int int_number = (int) f; // 명시적 형변환
		double dbNum = 12.845;
		int intNum = (int) dbNum;
		System.out.println(intNum);
		
		// char 자료형의 형 변환
		// 한개의 문자 값에 대한 자료형
		// 문자값을 작은 따옴표를 감싸는 형태

		
		char a1 = 'a';	//문자값
		char a2 = 97;	//아스키코드값
		char a3 = '\u0067';	//유니코드값
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		//byte 자료형을 char 자료형으로 변환
		// char 자료형에는 음수 표현식 X
		// byte의 음수잘형에 대한 오류를 방지하기 위해 변환 X
		byte byte_type = 10;
		
		// char char_type = byte_type;
		
		
	}

}