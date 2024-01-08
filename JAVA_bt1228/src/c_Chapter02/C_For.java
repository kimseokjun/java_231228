package c_Chapter02;


// 반복문(Loop)
// 어떤 작업을 반복적으로 실행하고 싶을때 사용

// For, while, do-while


public class C_For {

	public static void main(String[] args) {
		
		// for 문
		// 특정 조건이 만족될때까지 코드블록을 반복 실행
		// 규칙이 있는 작업을 반복하는 제어문
		// 반복 횟수가 정해져 있을 때 사용
		
		// 기본 구조
//		for(int i = 0; i<5; i++)//(초기화; 조건; 증감)
//		{
//			System.out.println(i);
//		}
		// 초기화
		// 반복문의 제어 변수를 초기화
		// 숫자형 변수를 사용하여 반복문이 실행되는 횟수를 제어
		
		// 조건
		// 루프가 계속 실행될 조건을 지정
		// 해당 조건이 거짓이 되면 루프가 종료
		
		// 증감
		// 루프의 각 반복 후에 실행, 보통 반복 변수를 증가 또는 감소 
//		int i = 1;
//		for(i = 1; i<6; i++)
//		{
//			System.out.println(i);
//		}
//		System.out.println(i);  // i는 6임
//		// 제어변수를 1로 초기화
		// 제어변수가 5이하인 동안에만 반복문 실행
		// 각 반복문 후에 num을 1씩 증가
		// 보통 for문의 제어 변수의 경우 i 키워드를 사용(index)
		// 제어 변수는 0으로 초기화 권장
		// 조건식은 초과, 미만의 연산 사용을 권장
		
		
//		for(int j = 0; j<11; j++)
//		{
//			if(j%2 ==0) //짝수 확인
//			{
//				System.out.println(j);
//			}
//		}
//		
		int sum = 0;
		for(int k = 1; k<=10; k++)
		{
			sum += k;
		}
		
		System.out.println(sum);
		
		int num = 3;
		for(int i = 1; i <=9; i++)
		{
			System.out.println( num+ " x " + i + " = " + num*i);
		}
		
	}

}
