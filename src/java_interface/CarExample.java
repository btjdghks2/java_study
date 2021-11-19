package java_interface;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		
		myCar.run();
		
		myCar.frontLeftTire = new kumhoTire();
		myCar.frontRightTire = new kumhoTire();
		
		myCar.run();

	}

}
