package e_Chapter04;

class GameCharacter{
	String name = null;
	int level = 0;
	int strength = 0;
	
	GameCharacter(String name, int level, int strength){
		this.name = name;
		this.level = level;
		this.strength = strength;
	}
	void displayInfo()
	{
		System.out.println("Name: " + name + " Level: "+ level + " Strength: " + strength);
	}
}
public class Object05 {

	public static void main(String[] args) {
	
		GameCharacter chac1 = new GameCharacter("Warrior", 10, 100);
	
		chac1.displayInfo();
	}

}
