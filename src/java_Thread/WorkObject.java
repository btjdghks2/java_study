package java_Thread;

public class WorkObject {
	public synchronized void methodA() {
		System.out.println("Thread의　method（）　작업실행");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
		}
	}
		
		public synchronized void methodB() {
			System.out.println("ThreadB의　methodB() 작업실행");
			notify();
			try {
				wait();
			} catch (InterruptedException e) {
				
			}
		}

}
