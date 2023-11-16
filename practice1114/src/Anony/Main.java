package Anony;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Parent p = new Child();
		Parent p = new Parent() {
			public void method() {
				System.out.println("I am a new child");
			}
		};
		
		
		
		p.method();

	}
	
	void method2() {
		/*
		public class Child2 extends Parent{
			void method() {
				System.out.println("I am a child");
			}
		} 
		Parent p = new child2(); */
		Parent p = new Parent() {
			System.out.println("I am a child");
		}
		p.method();
	};
}
