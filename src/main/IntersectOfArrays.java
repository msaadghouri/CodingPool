package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class IntersectOfArrays {

	/**
	 * Given two arrays, write a function to compute their intersection.
	 * Example:
	 * Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].
	 * */

	public static void main(String[] args) {
		int[] array1 = {1,2,2,1,3};
		int[] array2 = {2,2,3};
		ArrayList<Integer> arrayList= new ArrayList<>();
		Map<Integer, Integer> map= new HashMap<>();

		for(int i=0; i< array1.length; i++){
			if(map.containsKey(array1[i])){
				map.put(array1[i], map.get(array1[i])+1);
			}else{
				map.put(array1[i],1);	
			}
		}

		for(int i=0; i< array2.length; i++){
			if(map.containsKey(array2[i]) && map.get(array2[i])>0){
				arrayList.add(array2[i]);
				map.put(array2[i], map.get(array2[i])-1);
			}
		}
		System.out.println(arrayList);
		//		int[] result = new int[arrayList.size()];
		//		for(int i=0; i< arrayList.size(); i++){
		//			result[i]= arrayList.get(i);
		//		}
	}

}
