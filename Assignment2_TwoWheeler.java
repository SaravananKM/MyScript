package week1.day1;

public class Assignment2_TwoWheeler {
	int noOfWheels=2;
	short noOfMirrors=2;
	long chassisNumber=2752533355577L;
	boolean isPunctured=false;
	String bikeName="Avenger 120 Street";
	double runningKM=5300.35;
		
	public static void main(String[] args) {
		Assignment2_TwoWheeler avn=new Assignment2_TwoWheeler();
		System.out.println("Number Of Wheels: "+avn.noOfWheels);
		System.out.println("Number Of Mirrors: "+avn.noOfMirrors);
		System.out.println("Chassis Number: "+avn.chassisNumber);
		System.out.println("Is it Punctured: "+avn.isPunctured);
		System.out.println("Bike Name: "+avn.bikeName);
		System.out.println("KM Ran: "+avn.runningKM);
	}

}
