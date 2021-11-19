package java_interface;

public class MyClassB implements Myinterface {

	@Override
	public void method1() {
		System.out.println("MyClassB-method1() start");
		
	}

	@Override
	public void method2() {

		Myinterface.super.method2();
		System.out.println("MyClassB-method2() start");
	}

}
