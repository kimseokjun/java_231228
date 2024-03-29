package b_Chapter01;

public class B_DataType {

	// 데이터 타입(자료형, DataType)
	// - 자바는 강 타입 언어로, 모든 변수 선언 시 데이터 타입을 명시

	// 데이터 타입의 종류
	// - 기본 타입, 참조 타입
	// - 기본 타입 : 자바에서 미리 정의된 , 기본적인 타입
	// 변수를 선언하면 해당되는 자료형의 크기 만큼 메모리 할당
	// - 참조 타입 : 객체의 참조(메모리 주소)를 저장하는 변수 타입

	// 기본 자료형
	// 총 8가지의 기본형 타입

	// 정수형
	// byte : 1byte의 정수 (-128 ~ 127)
	// short : 2byte의 정수 (-32,768 ~ 32,767)
	// int(기본) : 4byte 의 정수 (약 -2.1억 ~ 약 2.1억)
	// long : 8byte 정수 (약 -2의 63제곱 ~ 약 2의 63제곱)

	// 문자형
	// char : 문자를 저장하기 위한 변수를 선언할 때 사용
	// - 문자형 데이터의 경우 따옴표를 사용해 감싸야 함

	// 실수형
	// float : 4바이트 소수점
	// double(기본) : 8바이트 소수점

	// 논리 형 : 참과 거짓
	// - 1바이트
	// 값이 존재하는지, 결과가 참인지 거짓인지 등을 표현
	// is키워드를 사용하여 해당 여부가 참인지 판단

	// 참조 자료형
	// - 기본 자료형을 기초로 만들어진 자료형
	// 실제 값을 갖는 것이 아닌 데이터가 저장된 메모리의 '주소 값'을 가지는 자료형
	// String : 문자열을 저장하는데 사용되는 참조 자료형
	// Array : 배열을 나타내는 참조 자료형
	
	
	public static void main(String[] args) {

		int age = 20;
		System.out.println(age);

		// long 데이터 타입은 숫자 뒤에 알파벳 L 또는 l을 써서 long 형임을 표시
		long apartmentPrice = 1000000000L;
		System.out.println(apartmentPrice);

		char grade = 'A';
		System.out.println(grade);

		float height = 169.2F;
		double price = 19.5;
		System.out.println(height);
		System.out.println(price);

		boolean isMarried = false;
		boolean isActived = true;
		System.out.println(isMarried);
		System.out.println(isActived);
		
		String str   = "This is String Type";
		System.out.println(str);
	}

}
