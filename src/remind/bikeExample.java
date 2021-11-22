package remind;

public class bikeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bike mybike = new bike();
		
		//잘못된　속도　변경
		mybike.setSpeed(-50);
		
		System.out.println("현재속도：" + mybike.getSpeed());
		
		//올바른　속도　변경
		mybike.setSpeed(60);
		
		//멈춤
		if(!mybike.isStop()) {
			mybike.setStop(true);
		}
		System.out.println("현재속도：" + mybike.getSpeed());
		

	}

}
