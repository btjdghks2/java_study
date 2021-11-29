package java_Thread;

public class AutoSaveThread extends Thread {
	public void save() {
		System.out.println("작업할　내용을　저장함");
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				break;
			}
			save();
		}
	}
	

}
