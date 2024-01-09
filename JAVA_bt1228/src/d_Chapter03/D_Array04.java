package d_Chapter03;

import java.util.Scanner;

// 기본 배열
// 배열의 선언 : 데이터 타입 [] 배열명;
// 배열의 초기화 : 배열명 = new 데이터타입[배열의길이];



public class D_Array04 {
	public static void main(String[] args) {
		//다치원 배열
		// : 배열의 배열( 2차원, 3차원,,,)
		// 데이터를 테이블 형태로 구성할 떄 유용
		// : ex) 게임 보드, 데이터 분석, 그래픽 등의 분야에 주로 사용

		// 다차원 배열의 선언 및 초기화
		// 2차원 배열 선언: 데이터 타입[][] 배열명;
		
		int [][] matrix;
		
		//2차원 배열 초기화 : 배열명 = new int [][];
		
		
		//다차원 배열의 경우 각 행에서 열의 개수가 서로 달라도 가능
		// 배열을 선언할 때 열의 크기는 지정하지 않아도 가능
		// 행의 크기는 반드시 지정
		matrix = new int[3][3];
		
		
		matrix[0][0] = 1;
		matrix[0][1] = 2;
		matrix[0][2] = 3;
		matrix[1][0] = 4;
		matrix[1][1] = 5;
		matrix[1][2] = 6;
		matrix[2][0] = 7;
		matrix[2][1] = 8;
		matrix[2][2] = 9;
		
		Scanner sc = new Scanner(System.in);
			

		int [][] threeFour = new int [3][4];
		int length = threeFour.length;
		int innerlength = threeFour[0].length;
		int count =1;
		for(int i = 0; i < length; i++ )
		{
			for(int j =0; j <innerlength; j++)
			{
				
				threeFour[i][j] = count++;
			}
		
		}
		for(int i = 0; i < length; i++ )
		{
			for(int j =0; j <innerlength; j++)
			{
				System.out.printf("%-3d", threeFour[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		for(int[] row : threeFour) {
			
			for(int value: row)
			{
				System.out.print(value + " ");
			}
			System.out.println();
		}
		
		
		
	}
}