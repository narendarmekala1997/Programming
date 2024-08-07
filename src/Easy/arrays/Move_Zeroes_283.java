package easy.arrays;
/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
 * */
public class Move_Zeroes_283 {

	public void moveZeroes(int[] nums) {

		int j = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				j = i;
				break;
			}
		}
		if (j != Integer.MIN_VALUE) {
			for (int i = j + 1; i < nums.length; i++) {
				if (nums[i] != 0) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
					j++;
				}
			}
		}

	}

}
