package chap07;

public class CellPhone {
	String model;
	String color;

	
	void powerOn() { System.out.println("power on"); }	
	void powerOff() { System.out.println("power out"); }
	void bell() { System.out.println("ring the bell"); }	
	void sendVoice(String message) { System.out.println("me: " + message); }	
	void receiveVoice(String message) { System.out.println("you: " + message); }	
	void hangUp() { System.out.println("hang up the call."); }
}
