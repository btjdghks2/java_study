package singleton;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Settings settings = Settings.getInstance();
		Settings settings1 = Settings.getInstance();
		System.out.println(settings != settings1);

	}

}
