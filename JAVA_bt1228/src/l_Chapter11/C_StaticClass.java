package l_Chapter11;

// 정적 내부 클래스(스태틱 클래스)
// : static 키워드가 붙은 내부 클래스
// : 단! 일반적인 static 필드 변수나 static 메서드와 다름!

// : >> static 클래스내부에는 instance 멤버와 static 멤버 모두 선언 가능
// : >> 외부 클래스의 인스턴스 멤버에는 접근이 불가, 정적 멤버에만 접근 가능
// : 외부 클래스의 인스턴스에 종속 되지 않는다.

class PocketBall{
	int size = 100;
	static int price = 5000;
	
	static class PocketMonster{
		static String name = "꼬부기";
		int level = 20;
		
		//정적 메서드
		public static void getPocketMonster() {
			// 외부 클래스의 인스턴스 멤버에는 접근이 불가
//			System.out.println(size); -error
			
			System.out.println(price);
			
			// 내부 클래스의 정적 멤버에는 접근 가능
			System.out.println(name);
//			System.out.println(level);  -error level은 정적 변수가 아니기때문에
		}
	}
}
public class C_StaticClass {
		public static void main(String[] args) {
			// 정적 내부 클래스의 인스턴스화는 외부 클래스의 인스턴스화 없이 선행 가능
			PocketBall.PocketMonster pocketmon = new PocketBall.PocketMonster();
			
			pocketmon.level = 30;
			System.out.println(pocketmon.level);
			
			//  정적 클래스 내의 정적 멤버는 . 인스턴스화 없이 사용가능
			System.out.println(PocketBall.PocketMonster.name);
		}
}
