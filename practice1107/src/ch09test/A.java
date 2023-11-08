package ch09test;

public class A {
	int field1 10 ;
	static int field2 10;
	B b = new B();
	C c = new C();
	// static B b1 = new B(); 이거는 안돼요
	static C c1 = new C();
	void method1() {
		B b = new B();
		C c = new C();
		}
	}
	static void method2() {} 
	 
	/*
	A() {
		System.out.println("A instance is generated.");
	}
	*/
	
	class B{
		void method() {
			field1 = 30;
			method();
			field2 = 40;
			method2();
			
		}
		/*
		B() {
			System.out.println("B instance is generated.");
		}
		int field1 = 10;
		//static int field2 = 20;
		void method1() {}
		//static void method2() {}
		 */
	}
	
	static class C{
		void method() {
			//field1 = 30;
			//method1();
			field2 = 40;
			method2();
		
	
		
		/*
		C(){
			System.out.println("C instance is generated.");
		}
		int field1 = 10;
		static int field2 = 20;
		void method1() {}
		static void method2() {}
		*/
	
	}
	
	 void method1 () {
		 class D {
			 D() {
				 System.out.println("D instance is generated.");
			 }
		 }
		 D d = new D();
	 }
	 void method2 () {
		// D d = new D(); 여기서는 안돼요
	 }
}
