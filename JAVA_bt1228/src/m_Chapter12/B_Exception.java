package m_Chapter12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// 사용자 정의 예외 클래스
// 자바의 Exception 클래스를 상속받는 자식 크르래스
class CustomException extends Exception {
	CustomException(String message){
		super(message);
	}
}
public class B_Exception {
	public static void main(String[] args) {
		// ! RuntimeException
		// : 프로그래머의 실수에 의해 발생하는 예외들을 포함
		// : 컴파일 시점에서 체크되지 X( unchecked exception)
		// NullPoiinterException, IndexOutofBoundsException 등
		
		
		// 1. NullPointerException
		// : 참조변수가 null값을 가리킬 때 , 해당 변수를 사용할 경우 발생
		try {
			String text = null;
			int length = text.length();
		}catch(NullPointerException e)
		{
			System.out.println("Null 참조 에러");
		}
		
		// 2. ArrayIndexOutofBoundsException
		// : 배열의 범위를 초과하는 인덱스에 접근할 때 발생
		int [] array = new int [10];
		
		try {
			array[10] = 10;
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 범위 초과");
		}
		
		// 자바의 기타 예외 클래스
		// IOexception
		// : 입출력 작업 중 예외가 발생할 경우 사용되는 예외
		// : checked exception - 컴파일 시점에서 예외 처리를 강제
		
		// 자바에서 파일 업로드 시 사용하는 FileReader 클래스 사용\
		try {
			FileReader file = new FileReader("C:\\eclipse-workspace\\JAVA_bt1228\\src\\m_Chapterexception.txt");
			BufferedReader bufferedReader = new BufferedReader(file);
			
			String line;
			while((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
		}catch(IOException e) {
			System.out.println("파일 읽기중 오류 발생" + e.getMessage());
		}
		
		//사용자 정의 예외
		// : 상황에 맞게 사용자가 직접 정의하여 사용하는 예외
		
		try {
			throw new CustomException("사용자 정의 예외 발생");
		}catch(CustomException exception) {
			System.err.println(exception.getMessage());
		}
	}
}
