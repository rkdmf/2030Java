package chap06;

public class CarGasExample {

	public static void main(String[] args) {
		CarGas myCar = new CarGas();
		
		myCar.setGas(5);  
		boolean gasState = myCar.isLeftGas();  
			System.out.println("run");
			myCar.run();  
		
		if(myCar.isLeftGas()) { 
			System.out.println("no need to charge gas");
		} else {
			System.out.println("have to charge gas");
		}

	}

}
