package week1.day2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] number= {13,2,21,4,6,7};
		int arrLen=number.length;
		Arrays.sort(number);
		System.out.println("The second largest number is: "+number[arrLen-2]);
	}

}
