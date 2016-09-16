import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		int range;
		int counter = 0;
		long output;
		int sum = 0;

		System.out.println("Enter a number and we will find all the multiples of 13");
		// Make a scanner
		Scanner input = new Scanner(System.in);
		// Store input a variable range
		range = input.nextInt();
		// Find all numbers divisible by 13 up to the range

		// Tell the user all of the numbers divisible by 13 within range
		for (int i = 0; i <= range; i++) {
			if (i % 13 == 0) {
				sum = sum + i;
				// sum += i
			}
		}
		System.out.println("The sum of the numbers divisibile by 13 from 0 to " + range  +" is:" + sum);

		 while (counter <= range) {
		
		 if (counter % 13 == 0) {
		
		 sum = sum + counter;
		
		 } // if
		
		 counter++;
		
		 } // while
		 System.out.println("The sum of the numbers divisibile by 13 from 0 to" + range +" is:" + sum);
	}// psvm

}
