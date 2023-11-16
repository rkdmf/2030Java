package practice1116;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		DivideZero d = new DivideZero ();
		try {
			d.method();
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("I'm alive");
	} */
		//Class c = Class.forName("java.lang.String");
		try {
			Class c = Class.forName("java.lang.String");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
