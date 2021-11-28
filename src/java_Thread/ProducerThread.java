package java_Thread;

public class ProducerThread extends Thread{
	private DataBox dataBox;
	
	public ProducerThread(DataBox dataBox) {
		this.dataBox = dataBox;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=3;i++) {
			String data = "Data-" + i;
			dataBox.setData(data);
		}
	}
	

}
