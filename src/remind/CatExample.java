package remind;

public class CatExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat1 = new Cat();
		System.out.println("cat1.company:" + cat1.company);
		System.out.println();
		
		Cat cat2 = new Cat("자가용");
		System.out.println("cat2.company:" + cat2.company);
		System.out.println("cat2.model:" + cat2.model);
		System.out.println();
		
		Cat cat3 = new Cat("자가용","빨강");
		System.out.println("cat3.company:" + cat3.company);
		System.out.println("cat3.model:" + cat3.model);
		System.out.println("cat3.color:" + cat3.color);
		System.out.println();
		
		Cat cat4 = new Cat("택시","검정",200);
		System.out.println("cat4.company:" + cat4.company);
		System.out.println("cat4.model:" + cat4.model);
		System.out.println("cat4.color:" + cat4.color);
		System.out.println("cat4.maxSpeed:" + cat4.maxSpeed);
		System.out.println();

	}

}
