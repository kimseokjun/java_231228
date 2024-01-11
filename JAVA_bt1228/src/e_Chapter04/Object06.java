package e_Chapter04;


// 축구 선수 클래스 작성
// FootballPlayer 클래스 작성

// 클래스 필드
// 선수이름(name), 포지션(position), 팀 이름(team), 골 수(goals)

// 선수 정보를 출력하는 메서드
// displayInfo() - 반환 X
// name, position, team, goals

class FootballPlayer{
	// 필드
	// 선언만 이루어지면 자동으로 해당 데이터의 기본값 부여
	String name = null;
	String position = null;
	String team = null;
	int goals = 0;
	
	FootballPlayer(){}
	
	void displayInfo()
	{
		// 줄이 길어지면 자동 줄바꿈 기능 이용가능
		// Window > Editor > Toggle Word Wrap
		// Alt + Shift + y
		System.out.println("Name:" + name + " Position:" + position + " Team:" + team + " Goals:" + goals);
	}
}


public class Object06 {

	public static void main(String[] args) {
		FootballPlayer player1 = new FootballPlayer();
		player1.name = "김석준";
		player1.position = "수비수";
		player1.team = "울산";
		player1.goals = 10;
		
		player1.displayInfo();
		player1.goals = 13;
		player1.displayInfo();
	}

}
