package remind;

public class notebookgameExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		notebookgame notebookgame = new notebookgame("샘숭","블랙",25);
		
		System.out.println("모델：" + notebookgame.model);
		System.out.println("색상：" + notebookgame.color);
		
		System.out.println("서버：" + notebookgame.gameserver);
		
		notebookgame.powerOn();
		notebookgame.gamematching("매칭중입니다");
		notebookgame.gamestart();
		notebookgame.gamend();
		notebookgame.powerOff();


	}

}
