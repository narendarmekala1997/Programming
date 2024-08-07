package easy.arrays;

import java.util.HashMap;
import java.util.Map;

//Given an array nums of size n, return the majority element.
//
//The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
//
// 
//
//Example 1:
//
//Input: nums = [3,2,3]
//Output: 3
//Example 2:
//
//Input: nums = [2,2,1,1,1,2,2]
//Output: 2
public class Majority_Element_169_using_moores_voting_algorithm {

	public int majorityElement(int[] nums) {

		int ele = nums[0];
		int count = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == ele) {
				count++;
			} else
				count--;
			if (count == 0) {
				if (i + 1 < nums.length) {
					count = 1;
					ele = nums[i + 1];
					i++;
				}

			}
		}
		return ele;
	}

}
