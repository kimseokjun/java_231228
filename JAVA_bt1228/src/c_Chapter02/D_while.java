package c_Chapter02;

import java.util.Scanner;

// while문
// 일반적으로 반복 획수가 지정되어 있지 않을 때 시용하는 반복문

// 조건을 검사하고 해당 조건이 true인 경우 코드 블럭을 실행하는 반복문


public class D_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//while(조건){
		// 조건이 true 일떄 실행할 코드
		//}
		
//		int num = 1;
//		while(num < 6)
//		{
//			System.out.println(num);
//			num++; //조건이 거짓이 될수 잇는 로직을 설정
////		}
//		
//		int i = 0;
//		while(true)
//		{
//			if(i % 2 == 0)
//			{
//				i++;
//				continue;// 아래에 오는 모든 코드를 무시하고 다시 조건을 검사
//			}
//			System.out.println(i);
//			i++;
//			
//			if(i == 20)
//			{
//				break;
//			}
//		}
		
//		int sum = 0;
//		int index =1;
//		while(true)
//		{
//			sum += index;
//			index++;
//			if(index>10)
//			{
//				break;
//			}
//		}
//		System.out.println(sum);
//		
		//Do-while문
		// 반복 실행할 코드를 무조건 한 번 실행한 후에 조건을 검사하는 반복문
		// 최초의 코드실행을 보장하는 기능
		// 기본구조
//		do {
//			
//		}
//		while();
		
		int doNumber = 1;
		do {
			System.out.println(doNumber);
			doNumber++;
		}while(doNumber<=4);
		
		Scanner sc = new Scanner(System.in);
		String input = null;
		
		do {
			System.out.println("yes를 입력하세요");
			input  = sc.nextLine();
			}while(!input.equals("yes"));
		// a.equals(b) 의 경우
		// a 와 b가 일치 한지 판단하여 논리값을 반환
		
		}
	}


