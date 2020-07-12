/**
This program will print a Sand Glass Star Pattern. 
Sample->
Input: 5 (Row Number)
Output: 
* * * * * 
 * * * * 
  * * * 
   * * 
    * 
    * 
   * * 
  * * * 
 * * * * 
* * * * * 
Code->
**/
import java.util.Scanner;

public class SandglassStarPattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Row Number:");
		int rowNumber = scanner.nextInt();
		SandglassPattern(rowNumber);
	}
	private static void SandglassPattern(int rowNumber) {
		for (int i = 1; i <= rowNumber; i++) { // First half start
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i + (rowNumber - (2 * i) + 1); k++) {
				System.out.print("* ");
			}
			System.out.println();
		} // First half end

		int space = rowNumber; // Second half start
		for (int l = 1; l <= rowNumber; l++) {
			for (int m = 1; m < space; m++) {
				System.out.print(" ");
			}
			space--;
			for (int n = 1; n <= l; n++) {
				System.out.print("* ");
			}
			System.out.println();
		} // Second half end
	}
}
