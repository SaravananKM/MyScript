package week3.day1.OOPS;

public class AxisBank extends BankInfo{
	public void deposit() {
		System.out.println("Amount deposited in Axis bank account");
	}
	public static void main(String[] args) {
		AxisBank a=new AxisBank();
		a.deposit();
	}

}
