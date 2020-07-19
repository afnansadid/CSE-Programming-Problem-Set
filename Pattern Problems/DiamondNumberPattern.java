/**
This problem will print a Diamond with number. 
Sample->
Input: 5 //Row Number for first half
Output: 
    1
   212
  32123
 4321234
543212345
 4321234
  32123
   212
    1

Code->
**/
import java.util.Scanner;

public class DiamondNumberPattern {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int rowNumber = scanner.nextInt();

		for (int i = 1; i <= rowNumber; i++) { // First half

			for (int space = 1; space <= rowNumber - i; space++) {
				System.out.print(" ");
			}

			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			for (int k = 2; k <= i; k++) {
				System.out.print(k);
			}
			System.out.println();
		}

		for (int l = rowNumber - 1; l > 0; l--) { // Second half

			for (int space = 1; space <= rowNumber - l; space++) {
				System.out.print(" ");
			}

			for (int m = l; m > 0; m--) {
				System.out.print(m);
			}
			
			for (int n = 2; n <= l; n++) {
				System.out.print(n);
			}
			System.out.println();
		}
	}
}
