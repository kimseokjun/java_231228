package e_Chapter04;

class Book{
	// Book 클래스의 필드
	String title=null;
	String author=null;
	
	// Book 클래스의 생성자 = 객체 생성 시 필드 기본 값 설정
	Book(String title, String author){
		this.title = title;
		this.author = author;
	}
	// Book 클래스의 메서드
	void displayInfo()
	{
		System.out.println("Title: " + title + " Author: " + author);
	}
	
}

public class Object04 {

	public static void main(String[] args) {
		// 객체 생성
		// 1. 클래스 정의 : 객체의 설계도 제작
		// 2. 객체 인스턴스화
		// 클래스를 바탕으로 객체 메모리에 인스턴스 하는 과정
		// : new 키워드를 사용
		// 3. 생성자 호출
		// : new 키워드 다음에는 클래스 생성자 호출
		// : 객체의 초기 상태를 설정
		
		//book은 Book 이라는 클래스 타입을 가짐
		Book book = new Book("어린왕자","생택쥐페리");
		
		// 객체 사용
		// 필드에 접근
		System.out.println(book.title);
		System.out.println(book.author);
		// 메서드 호출
		book.displayInfo();
		
		
	}

}
