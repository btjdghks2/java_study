package remote;

public class Television implements Remote {
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setMute(boolean mute) {
		// TODO Auto-generated method stub
		Remote.super.setMute(mute);
	}

	private int volume;
	

	

}
