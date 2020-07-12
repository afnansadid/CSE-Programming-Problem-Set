/**
This program will print a left triangle according to input. 
Sample->
Input: 5
Output: 
    *
   **
  ***
 ****
***** 

Code->
**/

import java.util.Scanner;

public class LeftTriangleStarPattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Row Number:");
		int rowNumber = scanner.nextInt();
		LeftTriangle(rowNumber);
	}
	private static void LeftTriangle(int rowNumber) {
		for(int i=1;i<=rowNumber;i++) {
			for(int j=1;j<=rowNumber-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
