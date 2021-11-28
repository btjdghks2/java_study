package java_Thread;

public class ThreadB extends Thread {
	private WorkObject workObject;
	
	public ThreadB(WorkObject workObjcet) {
		this.workObject = workObjcet;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			workObject.methodB();
		}
	}
	
	

}
