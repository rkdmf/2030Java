package chap07;

public class SportsCar extends Car{
	@Override
	public void speedUp() {
		speed += 10;
	}

	/*
	@Override
	public void stop() {
		System.out.println("stop the sportcar");
		speed = 0;
	}
	재정의 할 수 없음
	*/

}
