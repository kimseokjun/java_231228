package g_Chapter06;


//  음식점 클래스
// : 다양한 방법으로 주문을 받는 예시

class Restaurant{
	
	void placeOrder(String dish) {
		System.out.println(dish);
	}
	
	void placeOrder(String dish, int quantity) {
		System.out.println(dish + " * " + quantity);
	}
	void placeOrder(String dish, String specialRequests) {
		System.out.println(dish + " / " + specialRequests);
	}
	
	void placeOrder(String dish, int quantity, String specialReString) {
		System.out.println(dish + " * " + quantity +  " / " + specialReString);
	}
	
}
// 주문 메서드(placeOrder)
// : 메뉴 이름만 제공
// : 메뉴 이름과 수량 제공
// : 메뉴 이름과 특별 요청 사항 제공
// : 메뉴 이름과 수량과 특별 요청 사항 제공

public class Overloading02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1번 테이블
		
		Restaurant order1 = new Restaurant();
		order1.placeOrder("pizza");
		
		Restaurant order3 = new Restaurant();
		order3.placeOrder("Burget",2);
		
		order1.placeOrder("pasta", "Extra Cheese");
		
		Restaurant order2 = new Restaurant();
		order2.placeOrder("salad" , 3 , "No dressing");
		
	}

}
