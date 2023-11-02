package chap06;

public class CarRun {
	/* p262
	int speed; 
	
	int getSpeed() {
		return speed;
	}
	
	void keyTurnOn() {
		System.out.println("turn the key");
	}	
	
	void run() {
		for(int i=10; i<=50; i+=10) {
			speed = i;
			System.out.println("run.(시속:" + speed + "km/h)");
		}
	}	
}
*/
	/*p273
	String model;
	int speed;

	CarRun(String model) {
		this.model = model;
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for(int i=10; i<=50; i+=10) {
			this.setSpeed(i);
			System.out.println(this.model + "is run .(시속:" + this.speed + "km/h)");
		}
		*/
	int speed;
		
	void run() {
			System.out.println(speed + "으로 달린다");
		}
		
	public static void main(String[] args) {
			CarRun myCar = new CarRun(); 
			myCar.speed = 60;
			myCar.run();
		}
	}	
