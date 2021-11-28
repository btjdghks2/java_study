package java_Thread;

public class WaitNotifyExample2 {

	public static void main(String[] args) {
		DataBox dataBox = new DataBox();
		// TODO Auto-generated method stub
		
		ProducerThread producerThread = new ProducerThread(dataBox);
		ConsumerThread consumerThread = new ConsumerThread(dataBox);
		
		producerThread.start();
		consumerThread.start();

	}

}
