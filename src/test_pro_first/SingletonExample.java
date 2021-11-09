package test_pro_first;



public class SingletonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Singleton obj1 = new Singleton(); // error
		 * Singleton obj2 = new Singleton(); // error
		 * */
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("ture Singleton");
			
			
		} else {
			System.out.println("fale Singleton");
		}

	}

}
