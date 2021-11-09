package test_pro_first;

public class Singleton {
	private static Singleton Singleton = new Singleton();
	
	private Singleton() {
		
		static Singleton getInstance(){
			return Singleton;
		}
	}

	public static Singleton getInstance() {
		// TODO Auto-generated method stub
		return null;
	}

}
