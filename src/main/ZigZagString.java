package main;

public class ZigZagString {

	/**
	 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
	 * No of rows: 3 
	 * P   A   H   N
	 * A P L S I I G
	 * Y   I   R
	 * And then read line by line: "PAHNAPLSIIGYIR"
	 * Write the code that will take a string and make this conversion given a number of rows.
	 * */

	public static void main(String args[]){
		String str= "PayPalIsHiring";
		int rows=3;
		StringBuilder[] builder= new StringBuilder[rows];
		for(int i=0; i< rows; i++){
			builder[i]= new StringBuilder();
		}
		int index=0;
		while(index<str.length()){
			for(int i=0; i<rows && index<str.length(); i++){
				builder[i].append(str.charAt(index++));
			}
			for(int i=rows-2; i>0 && index< str.length(); i--){
				builder[i].append(str.charAt(index++));
			}
		}
		StringBuilder builder2 = new StringBuilder();
		for(int i=0; i< rows; i++){
			builder2.append(builder[i]);
		}
		System.out.println(builder2);
	}


}
