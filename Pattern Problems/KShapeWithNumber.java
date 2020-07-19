/**
This problem will print a K shape pattern with ALPHABET. 
Sample->

Output: 

A B C D E F 
A B C D E 
A B C D 
A B C 
A B 
A 
A 
A B 
A B C 
A B C D 
A B C D E 
A B C D E F 

Code->
**/
public class KShapeWithNumber {

	public static void main(String[] args) {
		
		for(int i=5;i>=0;i--) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)(j+65)+" ");
			}
			System.out.println();
		}
    
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print((char)(j+65)+" ");
			}
			System.out.println();
		}
	}
}
