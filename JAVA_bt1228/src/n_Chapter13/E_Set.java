package n_Chapter13;

import java.util.HashSet;
import java.util.Set;

// SET 인터페이스
// : 중복된 요소를 포함하지 않는 객체의 집합
// : 객체의 저장 순서를 저장하지 않음(삽입 순서를 유지하지 않음)
// : null 요소 포함 가능

// Set 컬렉션 종류
// 1. HashSet
// : 가장 많이 사용되는 Set 구현체
// : 가장 빠른 성능을 제공
// 삽입 순서나 요소의 정렬 상태를 보장 하지 않는다

// 2.LinkedHashSet
// : HashSet에서 순서를 추가한 형태
//  : 요소를 삽입 순서대로 유지


// 3. TreeSet
// : 정렬된 순서대로 요소를 유지
// : 요소의 순서가 중요하거나 요소를 정렬된 상태로 유지해야 할 때 사용
// : 자동 정렬

public class E_Set {

	public static void main(String[] args) {
			//add(Element element) : 요소 추가
			//remove(Object object) : 요소 제거
			//contains(Object object) : 요소 포함 여부 확인
			//size() : 셋의 크기 반환
			// isEmpty() : 셋이 비워져있는지 확인
		
		//HashSet 클래스 선언 방법
		//Set<E> set명 = new HashSet<E>
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("C++");
		set.add("Python");
		set.add("Java");
		System.out.println(set); //요소의 삽입 순서가 유지 되지 않음
		
		
		set.remove("Java");
		System.out.println(set);
		
		System.out.println(set.size());
		
		System.out.println(set.contains("Python"));
		System.out.println(set.contains("C"));
		
		set.clear();
		System.out.println(set.size());
		System.out.println(set.isEmpty());
	}

}
