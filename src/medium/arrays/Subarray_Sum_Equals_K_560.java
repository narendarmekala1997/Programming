package medium.arrays;

import java.util.HashMap;
import java.util.Map;

//Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
//
//A subarray is a contiguous non-empty sequence of elements within an array.
//
// 
//
//Example 1:
//
//Input: nums = [1,1,1], k = 2
//Output: 2
//Example 2:
//
//Input: nums = [1,2,3], k = 3
//Output: 2
public class Subarray_Sum_Equals_K_560 {
	
	public int subarraySum(int[] nums, int k) {

        int presum=0,count=0;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        map.put(0,1);

        for( int i =0 ; i<nums.length ; i++ ){
            presum +=nums[i];
            int temp = presum-k;
            count += map.getOrDefault(temp,0);
            map.put(presum,map.getOrDefault(presum,0)+1);  
        }

        return count;
        
    }

}
