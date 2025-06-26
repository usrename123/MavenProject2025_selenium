package org.project2025.com.starpatterns;

public class StarPattern1 {

	public static void main(String[] args) {
		/*
		 * 2. Use a for loop to print the following pattern: ``` 1 2 3 4 5 6 7 8 9 10
		 * 
		 * for(int i=1;i<=4;i++) { for(int j=1;j<=i;j++) { System.out.print("*");
		 * 
		 * } System.out.println(); }
		 * 
		 * 
		 * for(int i=1;i<=4;i++) {
		 * 
		 * for(int j=4;j>=i;j--) {
		 * 
		 * System.out.print("*"); } System.out.println(); }
		 

		for (int i = 1; i <= 4; i++) {

			for (int j = 3; j >= i; j--) {

				System.out.print("-");
			}
				for (int k = 1; k <= i; k++) {
					
					System.out.print("*");

				}
				System.out.println();

			}
			
		
		for(int i=1;i<=4;i++) {
			 
			 for(int j=2;j<=i;j++) {
			 
			 System.out.print("-"); 
			 }
			 
			  for(int k=4;k>=i;k--) {
				 
				 System.out.print("*");
			 }
			 
			 System.out.println();
			 }
		
	//=========================================
		for (int i = 1; i <= 4; i++) {

			for (int j = 3; j >= i; j--) {

				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				
				System.out.print("* ");
			}
			
			System.out.println();		
	//==========================================
			
}
*/
		//  *
	   //  ***
	//	  *****
//		 *******
		for (int i = 1; i <= 4; i++) {

			for (int j = 3; j >= i; j--) {

				System.out.print(" ");
			}
			for (int k = 1; k <=(i*2-1); k++) {
				
				System.out.print("*");
			}
			
			System.out.println();			
			
				

			}
			

			}
}
			 
	


			 
	
		

		
	
