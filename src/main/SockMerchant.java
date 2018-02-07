package main;

import java.util.HashMap;
import java.util.Scanner;

public class SockMerchant {

	/**
	 * Print the total number of matching pairs.
	 * Input line 1: 9
	 * Input line 2: 10 20 20 10 10 30 50 10 20
	 * */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for(int ar_i = 0; ar_i < n; ar_i++){
			ar[ar_i] = in.nextInt();
		}
		int result = sockMerchant(n, ar);
		System.out.println(result);
		in.close();
	}

	private static int sockMerchant(int n, int[] ar) {
		HashMap<Integer, Integer> map = new  HashMap<>();
		int counter=0;
		for(int i =0; i< ar.length; i++){
			if(map.get(ar[i])!=null){
				map.remove(ar[i]);
				counter++;
			}else{
				map.put(ar[i], 1);
			}
		}

		return counter;
	}

}
