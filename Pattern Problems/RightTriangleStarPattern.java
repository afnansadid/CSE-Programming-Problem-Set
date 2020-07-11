/**
This problem will print a right triangle according to input. 
Sample->
Input: 5
Output: 
* 
* * 
* * * 
* * * * 
* * * * * 

Code->
**/
import java.util.Scanner;
public class RightTriangleStarPattern {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Row Number:");
		int rowNumber=scanner.nextInt();
		RightTriangle(rowNumber);
	}
	public static void RightTriangle(int rowNumber) {
		for(int i=1;i<=rowNumber;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
