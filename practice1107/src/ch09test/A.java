package ch09test;

public class A {
	static int memberA =  10;
	A() {
		System.out.println("A instance is generated.");
	}
	
	class B{
		B() {
			System.out.println("B instance is generated.");
		}
		int field1 = 10;
		//static int field2 = 20;
		void method1() {}
		//static void method2() {}
	}
	
	static class C{
		C(){
			System.out.println("C instance is generated.");
		}
		int field1 = 10;
		static int field2 = 20;
		void method1() {}
		static void method2() {}
	
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
