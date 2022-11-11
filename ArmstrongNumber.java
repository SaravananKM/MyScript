package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// 153= (1*1*1)+(5*5*5)+(3*3*3)
		int input=153;
		int calculated=0,remainder, original;
		original=input;
		while(input>0){
			remainder=input%10;
			input=input/10;
			calculated=calculated+(remainder*remainder*remainder);
		}
		if (calculated==original) {
			System.out.println(original+" is a Armstrong number");
		} else {
			System.out.println(original+" is not a Armstrong number");
		}
	}

}
