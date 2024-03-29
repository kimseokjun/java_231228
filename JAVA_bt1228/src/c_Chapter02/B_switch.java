package c_Chapter02;

import java.util.Scanner;

// switch 조건문
// : 특정 변수의 값에 따라 실행할 코드 블록 범위를 결정
// : 비교할 변수를 case값과 비교하여 같은 case를 찾아 해당 case문을 실행
// : 같은 값의 case문을 찾으면 그 case문 부터 끝까지 실행이됨
// : break문을 이용하여 break문으로 종료시점을 결정



// 기본 구조
// switch (비교할 대상){
// 		case 1: 
//			케이스 값과 비교할 대상이 같을 경우 실행
//		case 2:
//		
//		default:
//			비교할 대상이 일치하든 안하든 실행되는 코드
// }



public class B_switch {

	public static void main(String[] args) {
		
		
		int chapter = 0;
		Scanner sc = new Scanner(System.in);
		
		
//		chapter = sc.nextInt();
//		switch(chapter)
//		{
//		case 1:
//			System.out.println("자바 기본 문법");
//			break;
//		case 2:
//			System.out.println("제어문 - 조건문/반복문");
//			break;
//		case 3:
//			System.out.println("배열");
//			break;
//		case 4:
//			System.out.println("객체 지향 프로그램");
//			break;
//		case 5:
//			System.out.println("객체 지향 응용 학습");
//			break;
//		case 6:
//			System.out.println("자바 심화 학습");
//			break;
//			
//		default : 
//			System.out.println("범위 초과");
//		}
		
		// switch 연습 예제  - 온도변환기
		// 사용자로부터 온도 단위를 선택
		// 1. 섭씨 -> 화씨  2. 화씨 -> 섭씨
		System.out.print("온도를 입력하세요 >> ");
		double temperature = sc.nextDouble();
		
		System.out.println("1 : 섭씨 -> 화씨 \n2 : 화씨 -> 섭씨");
		System.out.println("변환할 온도 단위를 선택하세요.");
		int choice = sc.nextInt();
		
		
		
		switch(choice) {
		case 1:
			double fahrenheit = (temperature * 9 / 5) + 32;
			System.out.println("섭씨 " + temperature + "도는 화씨로 " + fahrenheit + " 입니다.");
			break;
		case 2:
			double celsius = (temperature -32) * 5/9;
			System.out.println("화씨 " + temperature + "도는 섭씨로 " + celsius + " 입니다.");
			break;
		default:
			System.out.println("1 과 2 를 입력하세요.");
		}
		sc.close();
		
	}

}
