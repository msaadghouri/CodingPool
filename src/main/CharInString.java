package main;

import java.util.HashSet;
import java.util.Set;

public class CharInString {

	public static void main(String[] args) {

		/*
		 * SOS
		 * Expected signal: SOS-SOS-SOS-SOS
		 * Received signal: SOS-SPS-SQS-SJR
		 * Changed Alphabets: 4 (O-P, O-Q, O-J, S-R)
		 * */

		String message= "SOSOOSOSOSOSOSSOSOSOSOSOSOS";
		int j=0;
		for(int i=0;i<message.length();i++){
			if(message.charAt(i)!= ("SOS").charAt(i%3)){
				j++;
			}
		}
		System.out.println(j);

		/*
		 * Find string in string, based on characters
		 * ghouri - gsdhaoquccrkli has ghouri in sequence -> g--h-o-u--r--i
		 * ghouri - ighuro has ghouri but not in sequence
		 * */

		String string = "gsdhaoquccrklizzhlhregouxerizz";
		String findMe = "ghouri";
		int k=0;
		for(int i=0;i<string.length();i++){
			if(findMe.charAt(k)==string.charAt(i)){
				k++;
				if(k==findMe.length()) // Considering the Runtime, break loop when string is found
					break;
			}
		}
		if(k==findMe.length())
			System.out.println("YES");
		else
			System.out.println("NO");

		/*
		 * Check if a string is pangram i.e., having all 26 characters
		 * */

		String panString="We promptly judged antique ivory buckles for the next prize";
		String lowerCase= panString.replaceAll(" ", "").toLowerCase();
		Set<Character> characters= new HashSet<>();
		for(int i=0; i<lowerCase.length(); i++){
			if(!characters.contains(lowerCase.charAt(i))){
				characters.add(lowerCase.charAt(i));
				if(characters.size()==26)
					break;
			}
		}
		if(characters.size()==26)
			System.out.println("pangram");
		else
			System.out.println("not pangram");

		/*****************  OR  ********************/

		String allChar= "abcdefghijklmnopqrstuvwxyz";
		String s="";
		for(int i=0; i<lowerCase.length(); i++){
			s=String.valueOf(lowerCase.charAt(i));
			if(allChar.contains(s)){
				allChar=allChar.replace(s, "");
				if(allChar.length()==0)
					break;
			}
		}
		if(allChar.length()==0)
			System.out.println("pangram");
		else
			System.out.println("not pangram");
	}

}
