package f_Chapter05;

class Game{
	// 모든 게임 인스턴스에서 공유될 static 변수
	static int totalScore = 0;
	
	// 총 게임을 몇번 진행하였는지 확인하는 static 변수
	static int nmberOfGames = 0;
	
	// 게임 점수를 증가시키는 메서드
	
	Game(){
		nmberOfGames++;
	}
	void addScore(int score) {
		totalScore += score;
		System.out.println("Current Total Score: " + totalScore);
	}
	
}


public class Object03 {
	public static void main(String[] args) {
		Game game1 = new Game();
		Game game2 = new Game();
		Game game3 = new Game();
		Game game4 = new Game();
		Game game5 = new Game();
		Game game6 = new Game();
		
		game1.addScore(100);
		game2.addScore(100);
		
		System.out.println(Game.totalScore);
		System.out.println(Game.nmberOfGames);
	}
}