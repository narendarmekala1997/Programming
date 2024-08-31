package medium.arrays;

//Given an array having both positive and negative integers. The task is to compute the length of the largest subarray with sum 0.
//
//Input: arr[] = {15,-2,2,-8,1,7,10,23}, n = 8
//Output: 5
//Explanation: The largest subarray with sum 0 is -2 2 -8 1 7.
//
//Input: arr[] = {2,10,4}, n = 3
//Output: 0
//Explanation: There is no subarray with 0 sum.
//
//Input: arr[] = {1, 0, -4, 3, 1, 0}, n = 6
//Output: 5
//Explanation: The subarray is 0 -4 3 1 0.

import java.util.HashMap;
import java.util.Map;

public class Largest_subarray_with_0_sum {
	
	int maxLen(int arr[], int n)
    {
        // Your code here
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int sum=0;
        int max=0;
        for( int i=0  ; i<n  ;i++ ){
            
            sum = sum+arr[i];
            if( sum ==0 ){
                max = i+1;
            }
            else{
                if(map.containsKey(sum)){
                    max = Math.max(max, i- map.get(sum));
                }
                else{
                    map.put(sum,i);
                }
            }
        }
        return max;
    }

}
