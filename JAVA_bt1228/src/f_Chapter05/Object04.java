package f_Chapter05;

// 자바 객체 지향 프로그래밍
// 클래스 : 객체를 생성하기 위한 템플릿
// 클래스의 구조: 필드 , 생성자, 메서드

// 클래스의 필드: 클래스의 특성이 담긴 속성
// 클래스의 메서드 : 클래스의 내부에서 속성을 사용하거나 특정 ㅈ가업을 수행하는 코드 블럭
// 클래스 내에 정의
// 클래스의 객체가 수행할 수 있느 동작
// 프로그랠밍의 재사용성과 구조를 향상시키는 역할


// 메서드의 구조
// ReturnType methodName(Parameter List){
//	메서드 기능. 동작 정의
//}

// ReturnType(반환 유형)
// 메서드가 작업을 수행한 후 반환하는 데이터의 유형을 지정
// 반환 유형이 없는 경우 void로 지정

// methodName(메서드 이름)
// : 메서드를 식별하는 이름
// : 작업을 대표하여 설명하는 동사로 명명하는 것이 알반적

// Parameter List(매개변수 목록)
// 메서드에 전달되는 입력 값들의 목록
// 0개 이상으로 지정(지정하지 않을 수도 있다.)
// 각 매개변수는 자료형과 함꼐 선언


class Calculator{
	// 계산기의 덧셈 기능
	int addNumbers(int A, int B)// 매개변수 A,B
	{
		return A+B;//return 키워드를 사용하여 지정된 타입의 데이터를 반환
	}	
}

public class Object04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator cal = new Calculator();
		int num = cal.addNumbers(3, 4);
		System.out.println(num);
	}

}
