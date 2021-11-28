package java_Thread;

public class StatePrintThread extends Thread {
	private Thread targetThread;
	
	public StatePrintThread(Thread targetThread) {
		this.targetThread = targetThread;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			Thread.State state = targetThread.getState();
			System.out.println("타겟　스레드　상태：" + state);
			
			if(state == Thread.State.TERMINATED) {
				break;
			}
			try {
				//0.5 초간　일시정지
				Thread.sleep(500);
				
			} catch(Exception e) {}
		}
	}
	
	

}
