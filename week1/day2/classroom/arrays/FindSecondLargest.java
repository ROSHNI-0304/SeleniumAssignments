package week1.day2.classroom.arrays;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {

		// Here is the input
		int temp,size;
		int[] data = {2,3,4,6,7,11};
     size = array.length;
   for(int i = 0; i<size; i++ ){
         for(int j = i+1; j<size; j++){

            if(array[i]>array[j]){
               temp = array[i];
               array[i] = array[j];
               array[j] = temp;
            }
         }
      }
      System.out.println(" second largest number is:: "+array[size-1]);
   }
}
		/*
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 2) Pick the 2nd element from the last and print it
		 */
		

		
	

	
