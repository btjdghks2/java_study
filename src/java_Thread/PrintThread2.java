package java_Thread;

public class PrintThread2 extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			while(true) {
				System.out.println("실행중");
				Thread.sleep(1);
			}
		} catch (InterruptedException e) {
	}
	
	System.out.println("자원정리");
	System.out.println("실행종료");
	}
	

}
