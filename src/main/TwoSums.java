package main;

import java.util.HashMap;
import java.util.Map;

public class TwoSums {

	/**
	 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
	 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
	 * Example:
	 * Given nums = [2, 7, 11, 15], target = 9,
	 * Because nums[0] + nums[1] = 2 + 7 = 9,
	 * return [0, 1].
	 * */

	public static void main(String[] args) {
		int[] array = {3,2,4};
		int target = 6;
		int[] result= new int[2];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i< array.length; i++){
			if(map.containsKey(target-array[i])){
				result[0]=map.get(target-array[i]);
				result[1]= i;
				break;
			}
			map.put(array[i], i);
		}
		System.out.println(result[0]+" "+ result[1]);
	}

}
