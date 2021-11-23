package remind;

public class AnonymousExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anonymous anony = new Anonymous();
		
		anony.field.turnOn();
		
		anony.method1();
		anony.method2(
				new Remotecontrol() {

					@Override
					public void turnOn() {
						// TODO Auto-generated method stub
						System.out.println("smart티비를　켭니다");

					}

					@Override
					public void turnOff() {
						// TODO Auto-generated method stub
						System.out.println("smart티비를　끕니다");

					}
					
				}
);
	}

}
