package i_Chapter08;

import parentPackage.ParentClass;
// 접근 제어자

// 접근 제어자 정의
// : 클래스, 메서드, 변수의 접근 범위를 제어

// 접근 제어자의 종류
// private, default, protected, public
// : 클래스나 멤버 변수, 메서드, 생성자에 접근제어자가 지정되어 있지 않은 경우 기본값으로 지정

// 접근 제어자의 범위
// public > protected > (default) > private

// private : 같은 클래스 내에서만 접근 가능
// protected : 같은 패기지 내에서, 그리고 다른패키지의 자손 클래스에서 접근이 가능
// public : 접근제한이 전혀 없이 접근 가능

// 1. private
class PrivateClass{
	// 같은 클래스 내에서만 접근 가능한 private멤버 변수
	private int myField;
	private void myMethod()
		{
			
		}
}
class DefaultClass{
	int myField;
	void myMethod() {}
	}
class ChildClass extends PrivateClass{
	void childMethod() {
		//부모 클래스의 MyField변수가 private설정이 되어있어 외부에서 접근 불가능
		//super.myField;	//
	}
}

// 3. protected
// : 동일한 패키지 내의 모든 클래스와 다른 패키지의 하위 클래스에서 접근 가능
class ProtectedClass extends ParentClass{
	protected int myField;
	
	public ProtectedClass() {
		//생성자에서 부모 클래스 protected필드와 메서드에 접근
		// 부모클래스의 protected 필드에 접근
		System.out.println(protectedField);
		protectedMethod() ;
	}
		
}

//4. public 
// 어떤 클래스든 어떤 패키지에서든 가져올수있음

public class A_modifier {
	public static void main(String[] args) {
		
	}
}