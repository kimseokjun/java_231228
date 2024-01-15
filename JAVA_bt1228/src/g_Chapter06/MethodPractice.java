package g_Chapter06;

// BaseballPlayer 클래스
// : 선수의 이름(name), 타율(battingAverage), 홈런 수(homeRuns);

// 생성된 선수의 총 수(playerCount) 모든 인스턴스에서 공유

// 생성자
// 생성 시 선수의 이름, 타율, 홈런 수 를 받아서 인스턴수 변수 초기화
// 생성 시 정적 변수를 후위 증가

// 메서드
// : updateStats : 선수의 타율과 홈런 수를 업데이트 하는 메서드
// : 매개변수로 newBattingAverage, newHomeRuns를 입력
// : 타율 업데이트, 홈런 수 업데이트 ( 기존의 인스턴스 변수에 재할당)

// 

class BaseballPlayer{
	
	String name;
	double battingAverage;
	int homeRuns;
	static int playerCount =0;
	
	BaseballPlayer(String name, double battingAverage, int homeRuns){
		this.name = name;
		this.battingAverage = battingAverage;
		this.homeRuns = homeRuns;
		playerCount++;
	}
	
	void updateStats(double newBattingAverage, int newHomeRuns)
	{
		this.battingAverage = newBattingAverage;
		this.homeRuns = newHomeRuns;
	}
	
}
public class MethodPractice {

	public static void main(String[] args) {
		// BaseballPlayer 클래스로 야구선수 3명의 객체 생성
		// 총 생성된 선수의 수를 출력
			BaseballPlayer player1 = new BaseballPlayer("KIM",2.5,3);
			BaseballPlayer player2= new BaseballPlayer("PARK",3,10);
			BaseballPlayer player3 = new BaseballPlayer("LEE",1.6,0);
			
			player1.updateStats(3, 7);
			
			System.out.println(player1.name+" " + player1.battingAverage +" " + player1.homeRuns);
			
			System.out.println("생성된 선수 : " + BaseballPlayer.playerCount);
	}

}
