package chap06;

public class Calculator {
	/* p251
	void powerOn() {
		System.out.println("전원을 킵니다");
	}
	
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double divide(int x, int y) {
		double result = (double)x / (double)y;
		return result;
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다");
	}
}
*/
	
	/*p260
	int plus(int x, int y) {
		int result = x + y;
		return result; 
	}
	double avg(int x, int y) {
		double sum = plus(x, y);
		double result = sum / 2;
		return result;
	}
	
	void execute() {
		double result = avg(7, 10);
		println("result: " + result);
	}
	
	void println(String message) {
		System.out.println(message);
	}	
*/

//p265
	double areaRectangle(double width) {
	return width * width;
	}

	double areaRectangle(double width, double height) {
	return width * height;
	}	
//p276
static double pi = 3.14159;
	
	static int plus(int x, int y) {
		return x + y;
	}
	
	static int minus(int x, int y) {
		return x - y;
	}
}