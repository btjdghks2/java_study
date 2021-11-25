package java_study;

public class FinalizeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter counter = null;
		for(int i=1; i<=50; i++) {
			counter =new Counter(i);
			
			counter = null;
			
			System.gc();
		}

	}

}

// 따라서　가비지　컬렉터는　무작위로　소멸시킴
