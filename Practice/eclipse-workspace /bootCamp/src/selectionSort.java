package com.bptn.course1;
// bubble sort easier
// j = run
//k = 
 import java.util.Arrays;
 
public class selectionSort {

	public static void main(String[] args) {
		
		int[]a = {8, 4, 5, 9, 11, 2, 7} ; 
			
		     // For first FOR loop *
			for(int j=0; j< a.length-1; j++) {
				
				 
				int minIndex = j;     // *Store the index of the minimum value (temorarily)
				
				// For second FOR loop*
				for(int k = j+1; k <a.length; k ++) {
					
					
					if (a[k] < a[minIndex] ) {     // If the value at index K is smaller than the value at the minIndex
						minIndex= k;
					
						
						
				// now its time to loop swap values	
				int temp = a[j];
				
				a[j] = a[minIndex];
				
				a[minIndex]= temp;						
			}
					
			System.out.println(Arrays.toString(a));
					
					
				}
					
				
				
	     }
	  }

}
