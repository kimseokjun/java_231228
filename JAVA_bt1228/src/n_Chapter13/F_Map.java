package n_Chapter13;

import java.util.HashMap;
import java.util.Map;

//Map 인터페이스
// : 키와 값의 쌍으로 요소로 저장하는 데이터 구조
// : 키는 고유한 데이터, 하나의 값을 가리킴

//! Map의 주요특징
// - 키의 유일성 : 모든 키는 고유해야함 / 각 키는 하나의 값에만 매핑됨
// - 값의 중복 허용 : 값은 중복이 가능
// - 순서 : 대부분의 Map 구현체는 순서 보장 X / 

// Map 인터페이스 구현체
// HashMap
// : 해시 테이블을 사용하여 키-값 쌍을 저장
// : 순서를 유지X (삽입 순서나 요소의 정렬 상태를 보장하지 X) >> 작업 시간 빠름
// : null 허용

//2.LinkedHashMap
// : 삽입 순서를 유지
// : 요소의 삽입 순서가 중효하거나 빠른 검색이 필요할때 주로 사용

// 3. TreeMap
// : 키-값 쌍을 트리에 저장, 키에 따라 정렬되어 저장
// : 키에 null값 허용 X(값은 그대로 허용)




public class F_Map {
	public static void main(String[] args) {
		//Map 인터페이스 메서드
		//put(K key,V value) : 키와 값을 Map에 추가
		//get(Object key) : 지정된 키에 매핑된 '값'을 반환
		// remove(Object key) : 주어진 키와 연관된 키- 값 쌍 삭제(반환)
		// containsKey(Object key) : 주어진 키가 Map에 있는지 확인하여 boolean으로 반환
		// keySet():Map의 키 셋을 반환
		// values(); Map의 값 컬렉션을 반환
		// entrySet(): Map의 키- 값 쌍을 나타내는 Set을 반환
		
		//! Map 컬렉션 선언 방법
		// Map<키타입, 값타입> 인스턴스명 = new HashMap<키 타입, 값 타입>();
		
		// 래퍼 클래스(Wrapper Class)
		// : 기본 데이터 타입을 객체로 다루기 위해 사용
		// : 컬렉션 프레임워크는 객체를 저장하기 때문에 래퍼 클래스를 사용
		
		// String : 문자열을 담는 클래스 타입
		// Integer : 숫자를 담는 클래스 타입
		
		
		Map<String, Integer> students = new HashMap<String, Integer>();
		
		//값 추가
		students.put("Seokjun", 19);
		students.put("Roy", 19);
		students.put("Kyle", 19);
		
		//값 가져오기
		System.out.println(students.get("Roy"));
		
		//값 제거
		students.remove("Kyle");
		System.out.println(students);
		//키를 통한 값을 검사
		System.out.println(students.containsKey("Roy"));
		// 키-값 쌍이 수를 반환
		System.out.println(students.size());
		
		
	}
}
