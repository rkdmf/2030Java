package chap06;

public class Car {
	/*필드 6-2
	String company = "현대자동차";
	String model = "그랜저";
	String color = "검정";
	int maxSpeed = 350;
	int speed;
	*/
	
	//생성자 6-3
	//Car(String color, int cc){


	//생성자 p236, p242
	String company = "BMW";
	String model;
	String color;
	int maxSpeed;
	
	Car(){
		
	}
	
	Car(String model){
		//this.model = model;
		this(model, "은색", 250);
	}
	
	Car(String model, String color){
		//this.model = model;
		//this.color = color;
		this(model, color, 250);
	}
	
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	






}

