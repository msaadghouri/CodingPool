package main;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

	/**
	 * Given an array of integers, every element appears twice except for one. Find that single one.
	 * Note:
	 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
	 * */

	public static void main(String[] args) {
		int[] nums = {-1, -1, -2};
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0; i< nums.length; i++){
			if(map.containsKey(nums[i])){
				map.put(nums[i], map.get(nums[i])+1);
			}else{
				map.put(nums[i],1);	
			}
		}
		for(Map.Entry<Integer, Integer> entry: map.entrySet()){
			if(entry.getValue()==1){
				System.out.println(entry.getKey());
				break;
			}
		}
	}

}
