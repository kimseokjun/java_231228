package m_Chapter12;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

// java.util 패키지
// : 자바의 표준 라이브러리 중 하나
//: 데이터의 구조, 시간과 날짜 처리, 무작위 숫자 생성 등의 기능 포함

// : 시간과 날짜 처리하는 클래스
// Date 클래스
// : 날짜와 시간을 표현
// : 현재의 밀리초 단위까지를 반환
// toString() : 현재 날짜와 시간을 문자열 반환
// getTime() : 현재의 밀리초 단위를 반환

// Calendar 클래스
// : 날짜와 시간을 처리하기 위한 추상 클래스
// : Date 클래스 보다 더 빠른 날짜 시간 계산을 제공
// - getInstance() : 현재 날짜와 시간으로 설정된 Calendar 객채를 반환
// - get(int field)  : 지정된 필드의 값을 반환
// >> 객체의 필드값을 반환
// - set(int year, int month, int date) : 연, 월, 일을 설정



public class F_JAVA_Util {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println("현재 날짜와 시간은 : " + date.toString() );
		System.out.println("현재 시간은 : " + date.getTime());
		
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH ) +1; // month 0~ 11까지의 수를 반환
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println(year + " " +  month+ " " + day);
		
		//! 생일까지 남은 일수 계산 프로그램
		// 사용자로부터 생년월일을 입력받고
		// 다가오는 생일까지 남은 일수를 반환
		Scanner sc = new Scanner(System.in);
		// 1. 사용자로부터 생년월일을 입력 받기
		// 스캐너
		System.out.print("연도를 입력하세요 : ");
		int birthdayYear  = sc.nextInt();
		System.out.print("월을 입력하세요 : ");
		int birthdayMonth = sc.nextInt();
		System.out.print("일을 입력하세요 : ");
		int birthdayDay = sc.nextInt();
		
		// 현재 날짜와 시간을 포함하는 Calendar 인스턴스 생성
		Calendar today = Calendar.getInstance();
		
		// 사용자의 생일 설정(월은 0부터 시작하기 때문에 1 뺌)
		Calendar birthday = Calendar.getInstance();
		birthday.set(Calendar.YEAR, birthdayYear);
		birthday.set(Calendar.MONTH, birthdayMonth -1);
		birthday.set(Calendar.DAY_OF_MONTH, birthdayDay);
		
		// 올해의 생일이 이미 지났는지 확인
		if(birthday.before(today)) {
			// 이미 지났다면 내년으로 설정
			birthday.set(Calendar.YEAR, today.get(Calendar.YEAR) +1);
		}
		
		//날짜 차이 계산
		long difference = (birthday.getTimeInMillis()-today.getTimeInMillis()) / ((1000*60*60*24));
		
		System.out.println("남은 생일은 : " + difference);
	}

}
