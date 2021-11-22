package remind;

public class notebookgame extends notebook {
	
	int gameserver;
	
	notebookgame(String model, String color, int gameserver) {
		this.model = model;
		this.color = color;
		this.gameserver = gameserver;
		
	}
	void turnOn() {
		System.out.println("게임　서버" + gameserver +"로　시합니다");
	}
	void changeserver() {
		System.out.println("게임서버" + gameserver + "로　바꿉니다");
		
	}
	void turnOff() {
		System.out.println("게임　서버" + gameserver +"를　종료합니다");

	}
	

}
