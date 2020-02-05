package com.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


/**
 * 
LeetCode ¨C Two Sum (Java)  Given an array of integers, find two numbers such that they add up to a specific target number. 
The function twoSum should return indices of the two numbers such that they add up to the target, 
where index1 must be less than index2.
 */
public class TwoSum {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,10};
		int target = 6;
		System.err.println(Arrays.toString(twoSum(nums, target)));
	}
	
	public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if (map.containsKey(target - x)) {
                return new int[]{map.get(target - x), i};
            }
            map.put(x, i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
