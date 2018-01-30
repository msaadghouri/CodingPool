package main;

import java.util.Scanner;

public class BonAppetit {

	/*
	 * Anna and Brian order n items at a restaurant, but Anna declines to eat any of the kth item
	 *  (where 0 =< k < n) due to an allergy. When the check comes, they decide to split the cost
	 *  of all the items they shared; however, Brian may have forgotten that they didn't split the
	 *  kth item and accidentally charged Anna for it.
	 *  
	 *  You are given n, k, the cost of each of the  items, and the total amount of money that Brian
	 *   charged Anna for her portion of the bill. If the bill is fairly split, print Bon Appetit; 
	 *   otherwise, print the amount of money that Brian must refund to Anna. It is guaranteed that
	 *    the amount will always be an integer.
	 * */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] ar = new int[n];
		for(int ar_i = 0; ar_i < n; ar_i++){
			ar[ar_i] = in.nextInt();
		}
		int b = in.nextInt();
		int result = bonAppetit(n, k, b, ar);
		if(result==-1)
			System.out.println("Bon Appetit");
		else
			System.out.println(result);
		in.close();
	}

	private static int bonAppetit(int totalItems, int kthItem, int charged, int[] allCharges) {
		int sumWOKth=0;
		for(int i=0; i<totalItems; i++){
			sumWOKth+=allCharges[i];
		}
		sumWOKth-=allCharges[kthItem];
		sumWOKth=sumWOKth/2;
		if(charged==sumWOKth)
			return -1;
		else
			return charged-sumWOKth;
	}
}
