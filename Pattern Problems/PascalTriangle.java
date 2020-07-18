/**
This problem will print a Pascal Triangle. 
Sample->
Input: 5 (Row Number)
Output: 
    1 
   1 1 
  1 2 1 
 1 3 3 1 
1 4 6 4 1 

Code->
**/
import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int rowNumber = scanner.nextInt();
		for (int i = 0; i < rowNumber; i++) { // Row 
			int currentValue = 1;
			int dividend = i;
			int divisor = 1;
			for (int space = 1; space < rowNumber - i; space++) { // Space Print
				System.out.print(" ");
			}
			for (int j = 1; j <= i + 1; j++) { // Column 
				System.out.print(currentValue + " ");
				currentValue = currentValue * dividend / divisor;
				dividend--;
				divisor++;
			}
			System.out.println();
		}
	}
}
