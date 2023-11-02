package chap06;

public class CarGas {
	int gas;
	
	void setGas(int gas) {
		this.gas = gas;
	}
	
		boolean isLeftGas(){
			if(gas==0) {
				System.out.println("Empty gas"); 
				return false;
			}
			System.out.println("Full gas"); 
			return true;
		}
		
		
		void run() {
			while(true) {
				if(gas > 0) {
					System.out.println("run.(gas:" + gas + ")");
					gas -= 1;
				} else {
					System.out.println("stop.(gas:" + gas + ")");
					return;
				}
			}
		}
	}

