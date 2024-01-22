package m_Chapter12;

// java.lang
// : 자바 프로그램의 가장 기본적인 클래스들을 포함
// : 다른 모드 자바 애플리케이션에서 기본적으로 사용 가능
// : 별도의 import문 없이 사용 가능

// Object 클래스
// : 자바의 모든 클래스의 최상위 클래스
// : 모든 클래스는 Object 클래스로 부터 상속 받음, 기본적으로 생략 가능

// - toString() 메서드
//  : 객체의 문자열 표현을 변환
// - equals() 메서드
// : 두 객체가 동등한지 비교


// Math 클래스
// : 수학적 연산 및 함수를 제공하는 유틸리티 클래스
// : 모든 메소드와 변수가 static 이다 >> 객체 생성 없이 사용 가능
// abs(데이터) : 절대값 반환
// max(데이터1, 데이터 2), min(데이터1,데이터2), : 데이터 최대값과 최소값을 반환
// sqrt(데이터) : 제곱근 계산
// random() : 0.0 과 1.0 사이의 난수를 생성


//String 클래스 
// : 문자열의 내용 작성에 유용한 유틸리티를 담은 클래스
// - length() : 문자열의 길이를 반환
// - equals(데이터1, 데이터2) : 두 문자열을 비교
// - substring(int 시작인덱스, int 끝인덱스): 부분 문자열을 반환

// - indexOf(String str) - 특정 문자열의 위치를 찾는다
// - charAt(int index) - 특정 위치의 문자를 반환

class MyClass{
	private int id;
	private String name;
	
	public MyClass (int id, String name) {
		this.id = id;
		this.name = name;
		
	}
	
	public String toString() {
		return "MyClass{" + id + name + "}";
	}
	
	
}


public class E_Java_Lang {
	public static void main(String[] args) {
		MyClass myClass = new MyClass(123,"ksj");
		System.out.println(myClass.toString());
		
		String name = "김석준";
		String nickname = name;
		String nickname2 = "김석준";
		System.out.println(name.equals(nickname));
		System.out.println(name.equals(nickname2));
		System.out.println(name == nickname);
		
		double result1 = Math.abs(-3.5);
		System.out.println(result1);
		System.out.println(Math.max(1231245124,123123123));
		System.out.println(Math.random()*10);
		System.out.println(Math.pow(2,4));
		
		String a= "012345";
		System.out.println(a.charAt(3));
		}
}
