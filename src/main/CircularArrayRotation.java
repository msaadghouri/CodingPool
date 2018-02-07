package main;

public class CircularArrayRotation {

	/**
	 * John Watson performs an operation called a right circular rotation on an array of integers.
	 * After performing one right circular rotation operation, the last element of the array is transfered 
	 * to first and the remaining elements are shifted to right {1,2,3} -> {3,1,2}
	 * 
	 * Watson performs this operation k times. To test Sherlock's ability to identify the current element 
	 * at a particular position in the rotated array, Watson asks m queries, where each query consists of a 
	 * single integer, for which you must print the element at that particular index in the rotated array.
	 * 
	 * Example {1,2,3} k=2 => {2,3,1}
	 * query m =2 => array[2] = 1
	 * */

	public static void main(String[] args) {
		approach_NlogN();
		approach_logN();
	}

	private static void approach_NlogN() {
		int[] array = {1,2,3,4,5};
		int k=6; // No of rotations
		int size= array.length;
		for(int j=0; j < k % size; j++){
			int temp= array[size-1];
			for(int i=size-1; i>0; i--){
				array[i]=array[i-1];
			}
			array[0]=temp;
		}
		int[] m = {0,2,4}; // Queries
		System.out.print("Rotated Array: ");
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
		for(int i=0; i<m.length;i++){
			System.out.print(array[m[i]]+" "); // Print values at query index
		}	
		System.out.println("");
	}

	private static void approach_logN() {
		int[] array = {1,2,3,4,5};
		int k=6; // No of rotations
		int size= array.length;
		int[] m = {0,2,4}; // Queries
		int cutOff= k % size;
		for(int i=0; i< m.length; i++){
			if(m[i] - cutOff >= 0)
				System.out.print(array[m[i]-cutOff]+" ");
			else
				System.out.print(array[size+m[i]-cutOff]+" ");
		}

	}
}
