package remind;

public class Cat {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Cat() {	
	}
	Cat(String model){
		this.model = model;
		
	}
	Cat(String model, String color){
		this.model = model;
		this.color = color;
	}
	Cat(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	

}
