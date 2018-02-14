package main;

import java.util.HashMap;
import java.util.Map;

public class LongestSubString {

	/**Given a string, find the length of the longest substring without repeating characters.
	 * Examples:
	 * Given "abcabcbb", the answer is "abc", which the length is 3.
	 * Given "bbbbb", the answer is "b", with the length of 1.
	 * Given "pwwkew", the answer is "wke", with the length of 3. 
	 * Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
	 * */

	public static void main(String[] args) {
		String s="abcabcbb";
		Map<Character, Integer> map= new HashMap<>();
		int max=0, k=0;
		for(int i=0; i< s.length(); i++){
			if(map.containsKey(s.charAt(i))){
				k= Math.max(k, map.get(s.charAt(i))+1);
			}
			map.put(s.charAt(i),i);
			max= Math.max(max, i-k+1);
		}
		System.out.println(max);
	}

}
