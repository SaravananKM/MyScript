package week1.day1;

public class Mobile {
	public void makeCall() {
		System.out.println("Make Call");

	}
	public void sendMsg() {
		System.out.println("Send Message");

	}
	
	public static void main(String[] args) {
		Mobile mob=new Mobile();
		mob.makeCall();
		mob.sendMsg();
	}

}
