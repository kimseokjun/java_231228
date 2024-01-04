package a_basic;

//주석 :코드에 대한 설명과 메모를 담당
// 주석은 큰 따옴표 안에 작성할 경우 주석으로 인식하지 않는다.
/*
 여러줄 주석 가능
 */

// 자바 프로그램의 기본 구조
// 클래스 > 메서드 > 실행문

public class A_HelloJava {

	// 메서드의 시작
	public static void main(String[] args) {
		// 자바 기본 문법
		// 실행문을 끝낼때는 항상 세미클론(;)을 작성
		// 프로그램에게 해당 실행문이 종료되었음을 알려주는 기호

		// 자바의 중괄호는 클래스, 메서드의 구조를 작성하는 기호
		// 항상 열리는 중괄호와 닫히는 중괄호가 세트

		// 컴퓨터에게 전달할 명령(실행문)을 작성

		System.out.println("Hello Java");
		System.out.println("Hello Coding//");

		// 이클립스 단축키
		// 실행(ctrl + f11) 전 저장(ctrl + s) 하기
		// ctrl + space 자바 자동완성
		// 행 이동 : alt + 방향키(위, 아래)
		// 단어간 커서 이동 : ctrl + 방향키(좌,우)
		// 자동 형식 맞추기 : ctrl + shift + f
	}

}
