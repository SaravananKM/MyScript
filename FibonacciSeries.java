package week1.day2;

public class FibonacciSeries {
	// 0 1 1 2 3 5 8 13 ....
	// firstNum	=0 1 1 2 3 5  8  13  ->firstNum=secondNum
	// secondNum=1 1 2 3 5 8  13 21  ->secondNum=sum
	// sum	=firstNum+secondNum
	// sNum	=1 2 3 5 8 13 21 34
	public static void main(String[] args) {
		int range=7, firstNum=0, secondNum=1,sum;
		System.out.print(firstNum+" ");
		for(int i=1;i<range;i++) {
			sum=firstNum+secondNum; 
			firstNum=secondNum; 
			secondNum=sum; 
			System.out.print(firstNum+" ");
		}		
	}
}
