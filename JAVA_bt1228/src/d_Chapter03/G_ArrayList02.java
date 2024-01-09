package d_Chapter03;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class G_ArrayList02 {
	public static void main(String[] args) {
		
		ArrayList<String>  items = new ArrayList<>();
	
		items.add("사과");
		items.add("책");
		items.add("연필");
		items.add("시계");
		items.add("컵");
	
		Random rd = new Random();
		
		//0번째 인덱스 부터 마지막 요소의 인덱스 까지의 수 중에서 무작위 수 생성
		
		String selectedItem = items.get(rd.nextInt(items.size()));
		
		Scanner sc = new Scanner(System.in);
		String userSelect ;
		
		while(true)
		{	
			System.out.println(items);
			System.out.println("물건을 맞춰보세요");
			
			userSelect = sc.nextLine();
			if(userSelect.equals(selectedItem))
			{
				System.out.println("정답");
				break;
			}
			else {
				System.out.println("땡!! 계속해서 맞춰보세요");
			}
		}
		
		sc.close();
		System.out.println("종료되었습니다.");
	}
}