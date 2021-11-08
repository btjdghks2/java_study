package test_pro_first;

public class Student {// 클래스．
	
	int a;
	int b;
	
	public Student() {
		a = 10;
		b = 20;
	}
	
	public Student(int num1, int num2) {
		a = num1;
		b = num2;
	}
	
	public void sum() {
		System.out.println("합계　： " + (a + b));
	}
	
}

public class Student2{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student st = new Student();
		st.sum(); 
		Student st2 = new Student(0,10);
		st2.sum();
		

	}
	}



