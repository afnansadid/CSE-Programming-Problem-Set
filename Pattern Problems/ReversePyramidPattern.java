/**
This problem will print a Reverse Pyramid Star Pattern. 
Sample->
Input: 5 (Row Number )
Output: 
* * * * * 
 * * * * 
  * * * 
   * * 
    * 
Code->
**/

import java.util.Scanner;

public class ReversePyramidPattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Row Number:");
		int rowNumber = scanner.nextInt();
		RevPyranmid(rowNumber);
	}
	private static void RevPyranmid(int rowNumber) {
		for (int i = 1; i <= rowNumber; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i + (rowNumber - (2 * i) + 1); k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
