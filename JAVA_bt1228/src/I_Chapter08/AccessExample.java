package i_Chapter08;

// public  접근 범위 : 제한 X
public class AccessExample {
	
	public int publicVar = 1;
	
	// 동일한 패키지 O , 다른 패키지여도 상속 받는 하위 클래스에서 접근 가능
	protected int protectedVar = 2;
	
	// 같은 패키치 O, 다른패키지
	int defaultVar = 3;	//default
	
	// 동일한 클래스 내에서만 접근 가능
	private int privateVar = 4;
	
	
	public void showAccess() {
		System.out.println(publicVar);
		System.out.println(protectedVar);
		System.out.println(defaultVar);
		System.out.println(privateVar);
	}
	
	protected void showProtected() {
		System.out.println(protectedVar);
	}
	void showDefault() {
		System.out.println(defaultVar);
	}
	
	private void showPrivate() {
		System.out.println(privateVar);
	}
}