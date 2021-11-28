package java_Thread;

public class ThreadA extends Thread{
	private WorkObject workObject;
	
	public ThreadA(WorkObject workObject) {
		this.workObject = workObject;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			workObject.methodA();
		}
	}
	

}
