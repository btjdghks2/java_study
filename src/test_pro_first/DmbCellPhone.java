package test_pro_first;

public class DmbCellPhone extends CellPhone{
	
	int channel;
	
	DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}

	//메소드


	void turnOffDmb() {
		System.out.println("DMB　방송　수신을　멈춥니다．");
	
	}

	public void turnOnDmb() {
		// TODO Auto-generated method stub
		System.out.println("채널　"+ channel + "번　DMB　방송　수신을　시작합니다．");
	}

	public void changeChannelDmb(int channel) {
		// TODO Auto-generated method stub
		this.channel = channel;
		System.out.println("채널　" + channel + "번으로　바꿉니다．");
		
	}



}
