package c_Chapter02;

import java.util.Scanner;
// 조건문
// 프로그램의 흐름을 제어하는 데 사용되는 기본적인 구조 중 하나

// 조건문의 종류
// if, else if, else, switch 문

public class A_if {

	public static void main(String[] args) {
//		If
//		:조건에 따라 실행시키고자 하는 로직(프로세스)이 다를 때 사용하는 구문
//		: 조건이 참일 때 실행할 코드를 지정하는 구문

//		if 문 기본 구조
//		if(조건){
//			조건이 참일 때 실행되는 코드
//		}

//		조건을 true/false의 결과를 반환하는 boolean 형태의 표현식

//		if -else
//		조건이 true 일 때와 false 일 때 실행되는 코드를 각각 지정한 구문 
//		

		// int age = 12;
		/*
		 * if( age > 19) { System.out.println("성인입니다.");//조건이 참일때만 실행 } else //if문의 조건식이
		 * false 일 때가 else문의 조건 { System.out.println("성인이 아닙니다."); }
		 * 
		 * System.out.println("조건 검사 완료");
		 */

//		중첩 if 문
//		if문 혹은 else문의 코드 블럭 안에 if문을 작성
		Scanner sc = new Scanner(System.in);

		//System.out.println("나이를 입력하세요.");

		//int age = sc.nextInt();

		/*
		 * if (age <= 19) { if (age <= 13) { System.out.println("어린이 입니다."); } else {
		 * System.out.println("청소년 입니다."); }
		 * 
		 * System.out.println("미성년자 입니다.");
		 * 
		 * } else { System.out.println("성인입니다."); }
		 */

//		else if 문
//		여러 조건을 순차적으로 테스트 할때 사용
//		if문 뒤에 나오며, 여러개를 연속해서 사용 가능

		
//		if (age > 19) {
//			System.out.println("성인입니다.");
//		} else if (age <= 13) {
//			System.out.println("어린이 입니다.");
//		} else {
//			System.out.println("청소년입니다.");
//		}
//		들여쓰기 : tab 키
//		반대로 들여쓰기 : shift + tab키
		
		
			System.out.println("점수를 입력하세요 =>");
			int score = sc.nextInt();
			String result = null;
			if(score >= 0 && score <= 100)
			{
				if(score >= 90)
				{
					System.out.println("A");
					result = "A";
					
				}
				else if(score >=80)
				{
					System.out.println("B");
					result = "B";
					
				}
				else if(score >=70)
				{
					System.out.println("C");
					result = "C";
				}
				else if(score >=60)
				{
					System.out.println("D");
					result = "D";
				}
				else
				{
					System.out.println("F");
					result = "F";
				}
			}
			else {
				System.out.println("잘못입력했습니다.");
			}	
			
			System.out.println(score + "점은 " + result + "입니다.");
		
			
			int x,y = 0;
			System.out.print("x좌표를 입력하세요 : ");
			x = sc.nextInt();
			System.out.print("y좌표를 입력하세요 : ");
			y = sc.nextInt();
			//참조 자료형 :
			// 변수에 직접적인 데이터 X, 해당 데이터가 저장된 메모리 주소
			// 초기화하지 않고 사용할 경우 컴파일 오류 발생 가능
			// 기본 초기화 값은 null => 어떠한 데이터 객체도 담고 있지 않음.
			String result1 = null;
			
			if(x > 0&& y > 0)
			{
				System.out.println("1사분면");
				result1 = "1사분면";
			}
			else if(x < 0&& y > 0)
			{
				System.out.println("2사분면");
				result1 = "2사분면";
			}
			else if(x < 0&& y < 0)
			{
				System.out.println("3사분면");
				result1 = "3사분면";
			}
			else if(x > 0&& y < 0)
			{
				System.out.println("4사분면");
				result1 = "4사분면";
			}

			else if( x==0)
			{
				if(y != 0)
				{
					System.out.println("y축 위에 있습니다.");
				}
				else {
					System.out.println("원점입니다.");
				}
			}
			else if(y==0)
			{
				if(x != 0)
				{
					System.out.println("x축 위에 있습니다.");
				}
			}
		
			
			
			
			
	}
}
