package test_pro_first;

public class car {
	
	String company = "현대자동차";
	String model;
	String color;
	int maxspeed;
	
	car(){
		
	}
	car(String model){
		
	}
	car(String model, String color){
		
		this.model = model;
		this.model = color;
	}
	
	car(String model, String color, int maxspeed){
		
		this.model = model;
		this.color = color;
		this.maxspeed = maxspeed;
				
	}
	
}


