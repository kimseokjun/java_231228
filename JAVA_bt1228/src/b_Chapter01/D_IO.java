package b_Chapter01;

import java.util.Scanner;

// 자바의 입출력

public class D_IO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//입력 : 콘솔 창을 통해서 개발자로부터 입력을 받느느 것
		//출력 : 콘솔창으로 데이터를 출력하는 것
		
		//출력
		//System.out.println(출력하고자 하는 변수 또는 상수);
		int num = 213;
		System.out.println(num);
		
		//입력
		//Scanner 객체
		// : 다양한 입력 소스로 부터 데이터를 읽어올 수 있는 형태
		// (System.in) - 해당 콘솔 창에서 표준 입력 스트림을 이용
		Scanner sc = new Scanner(System.in);
		/*
		 * sc.nextLine();//엔터까지의 전체 라인을 문자열로 반환 
		 * sc.nextInt(); // 정수 데이터 입력
		 * sc.nextDouble(); // 실수 데이터 입력 
		 * sc.next(); //입력 내용을 문자열로 반환
		 */
		
		System.out.println("Enter an interger");
		int sc_number = sc.nextInt();
		
		System.out.println("Entered integer : " + sc_number);
		
		double sc_double = sc.nextDouble();
		System.out.println("Entered Double : " + sc_double);
		
		
		//Scanner 사용 후에는 스캐너 종료!
		
		sc.close();
		
	}

}