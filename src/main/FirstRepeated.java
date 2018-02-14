package main;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeated {

	/*
	 * Find the first repeated character in string
	 * Time Complexity: O(n)
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string= "abcdefgghii"; 
		Set<Character> hash= new HashSet<>();
		int i=0;
		while(i<string.length()){
			char ch= string.charAt(i);
			if(hash.contains(ch)){
				System.out.println(ch);
				break;
			}else{
				hash.add(ch);
			}
			i++;
		}
	}

}
