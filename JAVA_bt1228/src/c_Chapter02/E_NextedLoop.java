package c_Chapter02;


// 중첩된 반복문

// 반복문 안에 또 다른 반복문이 있는 구조
// 각 반복마다 내부 루프가 전체를 완전히 반복


public class E_NextedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		// 중첨 루프 예제
//		for(int i = 0; i<5; i++) {
//			for(int k = 0; k <5; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		
//		//----------------------------------------------------------
//		for(int i = 2; i<10; i++)
//		{
//			for(int j = 1; j< 10; j++)
//			{
//				System.out.println(i + " x " + j + " = " +i*j);
//			}
//			System.out.println();
//		}
		
//		
		
		for(int i = 1; i<=5; i++)
		{
			for(int j = 1; j <=i; j++)
			{
				System.out.print("*");	
			}
			System.out.println("");
		}
		
		
	}

}
