package d_Chapter03;

import java.util.Random;
import java.util.Scanner;

public class C_Array03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] com = {"가위", "바위", "보"};
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int computerChoiceIndex;
		String computerChoice;
		String userChoice;
		while(true)
		{
			System.out.println("가위바위보 게임입니다.");
			System.out.println("가위, 바위, 보 중에서 하나를 선택하십시오.");
			
			userChoice = sc.nextLine();
			
			if(userChoice.equals("종료"))
			{
				break;
			}
			computerChoiceIndex = rd.nextInt(com.length);
			String ComputerChoice = com[computerChoiceIndex];
			
			if((userChoice.equals("가위") && computerChoice.equals("보")
					||userChoice.equals("바위") && computerChoice.equals("가위")
					||userChoice.equals("보") && computerChoice.equals("바위")
					)
			{}
			
		
		
		
		}
			
			
			
		}
	}


