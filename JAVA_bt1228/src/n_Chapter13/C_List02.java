package n_Chapter13;


//! ArrayList & Linked 메서드 사용 시 유의사항

// 1. get , remove , set 메서드의 경우
// 인덱스가 유효한지 확인해야함
// >> 유효하지 않은 인덱스 사용시 IndexOutofBounds 예외 발생



public class C_List02 {
	// ArrayList vs LinkedList
	
	// 1. 정의 & 특징
	// ArrayList
	// - 내부적으로 배열을 사용하여 요소를 저장
	// - 요소를 읽는 것 빠름/ 요소를 추가, 삭제하는 것은 느림
	
	// LinkedList
	// - 내부적으로 이중 연결 배열을 사용하여 요소를 저장
	// - 요소를 추가하거나 삭제하는 것 빠름 / 요소를 읽는 것은 느림
	
	
	// 2. 저장 구조
	// ArrayList : 요소의 추가 및 삭제 시 요소를 이동시켜야함
	// - 인덱스를 통한 접근을 사용 : 빠름
	// 예) 정렬된 책장
	// 책의 번호를 아는 경우 해당 잭장에서 책을 빠르게 가져올 수 있음
	// 새 책을 책장의 중간에 추가 할 경우 - 책을 모두 한칸씩 옮겨야 함 : 시간이 오래걸림
	
	
	
	// LinkedList : 옆의 요소와 연결 변경하면 추가, 삭제 가능
	// 처음부터 요소를 순회해야함
	// 예) 도서 대출 리스트
	// 새로운 대출 기록을 추가하거나 기족 기록을 제거하는 것이 용이
}
