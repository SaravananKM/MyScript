package week1.day2;

public class ConvertANegativeNumberToPositiveNumber {

	public static void main(String[] args) {
		int number=-40;
		if(number<0) {
			number=number*(-1);
			System.out.println("The Given Negative Number is converted in to Positive Number: "+number);
		}else if(number>0) {
			System.out.println("The Number is Positive");
		}else {
			System.out.println("The Number is neither Positive nor Negative");
		}
	}
}
