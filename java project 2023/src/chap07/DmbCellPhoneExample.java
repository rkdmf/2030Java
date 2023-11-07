package chap07;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		DmbCellPhone dmbCellPhone = new DmbCellPhone("iPone 15 Pro", "black", 10);
		
		System.out.println("model: " + dmbCellPhone.model);
		System.out.println("color: " + dmbCellPhone.color);

		System.out.println("channel: " + dmbCellPhone.channel);
	
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("hello ?");
		dmbCellPhone.receiveVoice("hi, im fall");
		dmbCellPhone.sendVoice("oh !! i love you");
		dmbCellPhone.hangUp();

		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();

	}

}
