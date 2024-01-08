package d_Chapter03;

// 배열

//1. 배열이란?
// : 같은 타입의 여러 변수를 하나의 집합으로 다루는 것

// : 같은 타입의 데이터를 연속적으로 저장하고 쉽게 관리 가능
// : 배열은 '생성'하여 사용 (변수는 '선언'하여 사용)

public class A_Array01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 변수 : 선언하여 사용
		int korean = 90;
		int math = 70;
		int englilsh = 100;
		
		// 배열 : 생성하여 사용
		// : 생성하여 사용, (new 연산자를 사용하여 생성)
		// 배열의 선언(생성한 배열을 담을 그릇)
		// : 데이터타입[] 배열명;
		// : 데이터타입 배열명[];
		
		// 정수형의 데이터를 담을 수 있는 배열
		// 2. 배열의 생성
		// : new 데이터타입 [배열의 크기]; - 동적 초기화
		// : 실제 데잍터가 저장되는 것이 아님
		// : 데이터 배열이 저장된 첫 번쨰 메모리 주소가 저장
		int []array;
		array = new int[4]; //배열의 크기는 반드시 작성해주어야 한다
		
		// 배열을 선언하고 생성한 경우 모든 '요소'는 해당 데이터 타입의 기본값으로 초기화
		// 문자열(''), 숫자형(0), 논리형(false)
		// '요소' : 배열 내 각각의 데이터 
		
		System.out.println(array);
		// 배열을 선언한 뒤 데이터 삽입(변경)
		// : 배열 요소에 접근하기 위해서는 해당 요소의 인덱스를 이용
		
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		
		// 3. 선언과 동시에 초기화
		// 데이터 타입 [] 배열명 = new 데이터타입 []{요소1, 요소2, 요소3}; //정적
		// 요소의 개수를 파악하여 배열의 길이로 자동 지정
		
		int [] scoreList = new int[] {90, 70 ,100};
		System.out.println(scoreList[0]);
		System.out.println(scoreList[1]);
		System.out.println(scoreList[2]);
		
		char[] greet = {'h', 'e', 'l', 'l', 'o'};
		
		System.out.println(greet[0]);
		System.out.println(greet[1]);
		System.out.println(greet[2]);
		System.out.println(greet[3]);
		System.out.println(greet[4]);
		
		// 동적은 유연성이 필요할 떄 (언제 값을 넣을지 모르는 상황)
		
		// 4. 배열의 길이(크기)
		// : .length 속성으로 확인 가능
		// : 마지막 요소의 인덱스 배열 크기 -1
		// : 배열의 길이는 고정, 한 번 생성된 배열의 크기는 변경 불가
		
		int [] myArray = {1,4,2,5,3,3,2,2,2,4,5,3,1,2,6,7,8};
		System.out.println("배열의 크기 " + myArray.length);
		
		// 배열의 특징
		// - 한 번 생성되면 크기 변겅 X
		// - 참조 타입: 메모리 주소가 할당
		
		// String 타입의 배열 생성
		// : String 타입의 기본값은 null
		String [] fruits = new String[3];
		System.out.println(fruits[0]);
		
		fruits[0] = "apple";
		fruits[1] = "banana";
		fruits[2] = "melon";
		
		// for문을 이용하여 배열의 모든 요소를 순회
		// 배열의 첫 번째 요소부터 마지막 요소까지의 수만 큼 반복
		System.out.println("for문을 사용한 배열의 순회");
		int length = fruits.length;	//배열의 길이를 따로 변수로 만들어서 이용하는 것이 좋음
		for(int i = 0; i< length; i++)
		{
			System.out.println(fruits[i]);
		}
		System.out.println("for문을 사용한 배열의 순회2");
		int [] numbers = {1,2,3,4,5};
		
		int numberslength = numbers.length;
		for(int i = 0; i<numberslength; i++)
		{	
			numbers[i] *= numbers[i];
			System.out.println(numbers[i]);
		}
		
		// 배열의 모든 요소를 단순 순회
		// : 향상된 for문(for-each)
		// for(데이터 타입 변수명: 배열){
		//	// 배열의 모든 요소에 접근하는 코드
		// }
		// 코드가 간결하고 가독서잉 향상
		// 인덱스를 통한 요소 접근은 불가능하다.
		int [] arrayNumber = {9,8,7,6,5};
		
		for(int j : arrayNumber) {
			System.out.println(j);
		}
		
		//for문, if문을 활용한 데이터 검색
		
		System.out.println("========================");
		//myArray 배열에 8이 존재하는지 확인
//		int myArrayLength = myArray.length;
//		int target = 8;
//		boolean found = false;
//		int i ;
//		for(i = 0; i<myArrayLength; i++)
//		{
//			
//			if(myArray[i] == target)
//			{
//				
//				found = true;
//				break;
//				
//			}
//		}
//		int targetindex = i+1;
//		if(found == true)
//		{
//			System.out.println(targetindex +"번쨰에서" + "데이터를 찾았습니다.");
//		}
		
		// 요소 삭제
		int [] original = {1,2,3,4};
		int removeIndex = 2;
		int [] result = new int [original.length-1];
		
		int originalLength = original.length;
		int k =0;
		for(int i = 0; i<originalLength; i++)
		{
			if(i == removeIndex)
			{
				//루프의 나머지 부분을 건너뛰고 다음 반복을 진행
				continue;
			}
			
			result[k++] = original[i];
			
		}
		for(int i =0; i<result.length; i++)
		{
			System.out.println(result[i]);
		}
		
	}
}