package exam03;

public class Car {
	private double speed = 0;
	private double position = 0;
	
	
	
	
	public void SetSpeed(double speed) {
		this.speed = speed ;
	
	}
	
	
	public void Move() {
		position += speed;
		
	}
}
