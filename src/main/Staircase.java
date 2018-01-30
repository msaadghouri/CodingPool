package main;

import java.util.Scanner;

public class Staircase {

	/*
	 * Sample output
			     #
			    ##
			   ###
			  ####
			 #####
			######
	 * */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		staircase(n);
		staricase2(n);
		in.close();
	}

	private static void staircase(int n) {
		StringBuilder builder= new StringBuilder();
		builder.append("#");
		for(int i=n; i>0; i--){
			// %_s provides a string with minimum length of '_'
			System.out.printf("%"+(n+1)+"s",builder.toString()+"\n"); 
			builder.append("#");
		}
	}

	private static void staricase2(int n) {
		for(int i=0; i<n; i++){
			for(int j=0; j<n ;j++){
				if(j>=n-i-1)
					System.out.print("#");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}
}
