package d_Chapter03;

import java.util.ArrayList;

public class F_ArrayList01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ArrayList 클래스
		// 자바의 라이브러리에서 제공하는 기능
		// java.utils.ArrayList 를 import해서 사용
		
		// 일반 배열과 공통점
		// - 연속된 메모리 공간사용
		// - 인덱스 번호 0부터 사용
		
		// 차이점
		// : 일반 배열은 크기가 고정이 되어있지만, ArrayList는 크기가 가변적이다.
		// : 배열의 타입 지정시. 일반 데이터 타입이 아닌 참조 타입으로 작성
		// : int(Integer), char(Charactor), boolean(Boolean), String
		
		// ArrayList 생성
		// ArrayList<데이터타입> 배열명 = new ArrayList<>();
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		//ArrayList 데이터 추가
		//해당 리스트의 가장 끝에 값을 추가		
		//배열명.add(추가할 데이터);
		
		arrayList.add(1);//인덱스 0
		arrayList.add(2);// 1
		arrayList.add(3);// 2
		
		// ArrayList 데이터 변경
		// 배열명.set(인덱스번호, 변경할데이터);
		arrayList.set(1, 5);
		
		System.out.println(arrayList);
		
		//ArrayList 데이터 삭제
		//arrayList.remove(인덱스 번호);
		arrayList.remove(1);
		
		System.out.println(arrayList);
		
		//ArrayList 원하는 위치에 데이터 삽입
		//배열명.add(인덱스 번호 , 데이터);
		arrayList.add(1,4);
		arrayList.add(1,5);
		arrayList.add(1,6);
		
		
		//ArrayList 크기 확인
		// 배열명.size();
		int size = arrayList.size();
		System.out.println(size);
		
		System.out.println(arrayList);
		
		//ArrayList 특정 요소 접근
		// 배열명.get(인덱스번호);
		System.out.println(arrayList.get(3));
		
		
	}

}
