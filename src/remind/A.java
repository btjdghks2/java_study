package remind;

public class A {
	A() {System.out.println("A　객체가　생성됨");}
	
	//인스턴스　멤버　클래스（static　이　제외됨）
	
	class B{
		B() { System.out.println("B 객체가　생성됨");}
		int field1;
		void method1() { }
	}
	
	// 정적　멤버　클래스（static 이　사용됨）
	
	static class C{
		C() { System.out.println("C 객체가　생성됨");}
		int field1;
		static int field2;
		void method1() { }
		static void method2() { }
	}
	
	// 로컬　클래스　（메소드　안에　중첩클래스　선언）
	void method() { //이　부분이　핵심
	class D{
		D() { System.out.println("D 객체가　생성됨");}
		int field1;
		void method1() { }
	}
	D d = new D();
	d.field1 = 3;
	d.method1();
	
	}

}
