package ch09test;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		A.B b = a.new B();
		A.C c = new A.C();
		a.memberA = 20;
		c.field1 = 10;
		c.field2 = 20;
	}

}
