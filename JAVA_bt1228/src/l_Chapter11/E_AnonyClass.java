package l_Chapter11;

// 익명 내부 클래스(익명 클래스) Anonymous 
// : 이름이 없는 클래스
// : 주로 일회용으로 사용되는 인스턴스를 생성할 때 사용
// : 클래스를 별도로 선언하지 않고도, 바로 인스턴스화 가능

// 특징
// - 이름이 없기 때문에 생성자가 없다.
// - 제한 : 외부의 final 키워드인 변수에만 접근이 가능

interface DiscountEvent{
	void applyDiscount();
}

class OnlineShoppingMall{
	
	void startSaleEvent(String event) {
		// 익명 클래스
		// : 인스턴스화와 동시에 클래스 정의
		DiscountEvent eventHandler = new DiscountEvent() {
				public void applyDiscount() {
					System.out.println("Appyling 50% discount");
				}
		};
		
		eventHandler.applyDiscount();
	}
}


public class E_AnonyClass {

}
