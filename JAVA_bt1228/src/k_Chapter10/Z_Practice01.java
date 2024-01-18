package k_Chapter10;

abstract class MobileApp{
	abstract void execute();
	void appInfo() {
		System.out.println("모바일앱 설명");
	}
}

class GameApp extends MobileApp{
	void execute() {
		System.out.println("게임 앱 실행");
	}
	void appInfo() {
		System.out.println("게임 앱 설명");
	}
}

class SocialApp extends MobileApp{
	void execute() {
		System.out.println("소셜 앱 실행");
	}
}
public class Z_Practice01 {
		public static void main(String[] args) {
			MobileApp gameapp = new GameApp();
			MobileApp socialapp = new SocialApp();
			gameapp.execute();
			gameapp.appInfo();
			socialapp.execute();
			socialapp.appInfo();
		}
}
