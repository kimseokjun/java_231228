package d_Chapter03;

import java.util.Scanner;

public class B_Array02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int SecretNum = (int)(Math.random()*100 +1);
		//Math.random () : 0.0 이상 1.0미만 무작위 실수 반환
		while(true)
		{
			System.out.println("숫자를 말씀하세요(1~100)");
			Scanner scanner = new Scanner(System.in);
			int userNum = scanner.nextInt();
			if(userNum > SecretNum)
			{
				System.out.println("다운");
			}
			else if(userNum < SecretNum)
			{
				System.out.println("업");
			}
			else
			{
				System.out.println("정답입니다.");
				break;
			}
			
		}
	}

}
