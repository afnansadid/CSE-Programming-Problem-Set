/**
This program will print a Diamond Pattern. 
Sample->
Input: 5 (Row Number For First Half)
Output: 
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
Code->
**/
import java.util.Scanner;

public class DiamondPattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Row Number (First Half):");
		int rowNumber=scanner.nextInt();
		Diamond(rowNumber);
	}
	private static void Diamond(int rowNumber) {
		for(int i=1;i<=rowNumber;i++) { // First half start
			for(int j=1;j<=rowNumber-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		} // First half end
		int space=1; // Second half start
		for(int l=rowNumber-1;l>0;l--) {
			for(int m=1;m<=space;m++) {
				System.out.print(" ");
			}
			for(int n=1;n<=2*l-1;n++) {
				System.out.print("*");
			}
			System.out.println();
			space++;
		} // Second half end
	}
}
