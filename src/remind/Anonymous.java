package remind;

public class Anonymous {
	
	Remotecontrol field = new Remotecontrol() {

		@Override
		public void turnOn() {
			// TODO Auto-generated method stub
			System.out.println("티비를　켭니다");
			
		}

		@Override
		public void turnOff() {
			// TODO Auto-generated method stub
			System.out.println("티비를　끕니다");
			
		}
		
		
	};
	
	void method1() {
		Remotecontrol localVar  = new Remotecontrol() {

			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				System.out.println("오디오를　켭니다");

			}

			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				System.out.println("오디오를　끕니다");

			}

		
	};
	
	localVar.turnOn();
	}
	void method2(Remotecontrol rc) {
		rc.turnOn();
	}}
	


