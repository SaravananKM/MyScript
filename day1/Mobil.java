package week1.day1;

public class Mobil {
	String mobileBrandName="Xiaomi";
	char mobileLogo='m';	
	short noOfMobilePiece=23;
	int modelNumber=25323;
	long mobileImeiNumber=2752532932237L;
	float mobilePrice=11235.23f;
	boolean isDamaged=false;
	
	public static void main(String[] args) {
		Mobil m=new Mobil();
		System.out.println("Mobile Brand Name: "+m.mobileBrandName);
		System.out.println("Mobile Logo: "+m.mobileLogo);
		System.out.println("Number Of Mobile Piece: "+m.noOfMobilePiece);
		System.out.println("Model Number: "+m.modelNumber);
		System.out.println("Mobile IMEI Number: "+m.mobileImeiNumber);
		System.out.println("Mobile Price: "+m.mobilePrice);
		System.out.println("Is it Damaged: "+m.isDamaged);
	}

}
