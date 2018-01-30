package main;

import java.util.Scanner;
import java.util.Stack;

public class SuperReducedString {

	/*
	 * In one operation, delete any pair of adjacent letters with same value
	 * Ex: aaabccdd -> abccdd
	 * abccdd -> abdd
	 * abdd -> ab
	 * */

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		String string= scanner.nextLine();
		usingString(string);
		usingStringBuilder(string);
		usingStack(string);
		scanner.close();
	}

	private static void usingStack(String string) {
		Stack<Character> stack= new Stack<>();
		for(int i=0; i<string.length(); i++){
			if(!stack.isEmpty() && (stack.peek()).equals(string.charAt(i))){
				stack.pop();
			}else{
				stack.push(string.charAt(i));
			}
		}

		if(stack.isEmpty())
			System.out.println("Empty String");
		else{
			int stackSize=stack.size();
			StringBuilder builder= new StringBuilder();
			for(int i=0;i<stackSize;i++){
				builder.append(stack.pop());
			}
			System.out.println(builder.reverse());
		}

	}

	private static void usingString(String string) {
		for(int i=1;i<string.length();i++){
			if(string.charAt(i-1)==string.charAt(i)){
				string=string.substring(0, i-1)+string.substring(i+1, string.length());
				i=0;
			}
		}
		if(string.length()==0)
			System.out.println("Empty String");
		else
			System.out.println(string);

	}

	private static void usingStringBuilder(String string) {
		StringBuilder builder = new StringBuilder(string);
		for(int i=1;i<builder.length();i++){
			if(builder.charAt(i-1)==builder.charAt(i)){
				builder.delete(i-1, i+1);
				i=0;
			}
		}
		if(string.length()==0)
			System.out.println("Empty String");
		else
			System.out.println(string);
	}
}
