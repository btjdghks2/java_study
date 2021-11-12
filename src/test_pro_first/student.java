package test_pro_first;

public class student extends People{
	public int studentNo;
	
	public student(String name, String ssn,int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
	}

}
