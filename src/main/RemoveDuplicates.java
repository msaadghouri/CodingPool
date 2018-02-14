package main;

public class RemoveDuplicates {

	/**
	 * Given a sorted array, remove the duplicates in-place such that each element appear 
	 * only once and return the new length.Do not allocate extra space for another array, 
	 * you must do this by modifying the input array in-place with O(1) extra memory.
	 * */

	public static void main(String[] args) {
		int[] array= {1,2,4,4,5,5,6,7};
		int index=0;
		if(array.length>1){
			for(int i=0; i< array.length-1; i++){
				if(array[i]!=array[i+1]){
					array[index]=array[i];
					index++;
				}
			}
			array[index]=array[array.length-1];
			index++;
			for (int i=0; i<index; i++)
				System.out.print(array[i]+" ");
		}
	}
}
