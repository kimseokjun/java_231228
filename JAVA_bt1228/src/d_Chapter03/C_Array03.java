package d_Chapter03;

import java.util.Random;
import java.util.Scanner;

public class C_Array03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] Choice = {"가위", "바위", "보"};
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int computerChoiceIndex;
		String computerChoice,userChoice;
		
		while(true)
		{
			System.out.println("가위바위보 게임입니다.");
			System.out.println("가위, 바위, 보 중에서 하나를 선택하십시오.");
			
			userChoice = sc.nextLine();
			
			if(userChoice.equals("종료"))
			{
				break;
			}
			// random.nextInt(n) : 0부터 n-1까지의 사이에서 무작위 수를 찾아냄
			computerChoiceIndex = rd.nextInt(Choice.length);
			computerChoice = Choice[computerChoiceIndex];
			
			if((userChoice.equals("가위") && computerChoice.equals("보"))
					||(userChoice.equals("바위") && computerChoice.equals("가위"))
					||(userChoice.equals("보") && computerChoice.equals("바위"))
					)
			{
				System.out.println("승리하셨습니다.");
			}
			else if((userChoice.equals("가위") && computerChoice.equals("바위"))
					||(userChoice.equals("바위") && computerChoice.equals("보"))
					||(userChoice.equals("보") && computerChoice.equals("가위"))
					)
			{
				System.out.println("패배하셨습니다.");
			}
			else{
				System.out.println("무승부하셨습니다.");
			}
			System.out.println("사용자 : " + userChoice  + " 컴퓨터 : " + computerChoice );
		}
		sc.close();
		}
	}


