package medium.arrays;

import java.util.HashMap;
import java.util.Map;
//Problem statement
//You are given an array 'a' of size 'n' and an integer 'k'.
//
//
//
//Find the length of the longest subarray of 'a' whose sum is equal to 'k'.
//
//
//
//Example :
//Input: ‘n’ = 7 ‘k’ = 3
//‘a’ = [1, 2, 3, 1, 1, 1, 1]
//
//Output: 3
//
//Explanation: Subarrays whose sum = ‘3’ are:
//
//[1, 2], [3], [1, 1, 1] and [1, 1, 1]
//Sample Input 1 :
//7 3
//1 2 3 1 1 1 1
//
//
//Sample Output 1 :
//3
//
//
//Explanation Of Sample Input 1 :
//Subarrays whose sum = ‘3’ are:
//[1, 2], [3], [1, 1, 1] and [1, 1, 1]
//Here, the length of the longest subarray is 3, which is our final answer.
//
//
//Sample Input 2 :
//4 2
//1 2 1 3
//
//
//Sample Output 2 :
//1
//
//
//Sample Input 3 :
//5 2
//2 2 4 1 2 
//
//
//Sample Output 3 :
//1
//
//
//Expected time complexity :
//The expected time complexity is O(n).
//
//
//Constraints :
//1 <= 'n' <= 5 * 10 ^ 6
//1 <= 'k' <= 10^18
//0 <= 'a[i]' <= 10 ^ 9
//
//Time Limit: 1-second
//Here, the length of the longest subarray is 3, which is our final answer.

public class Longest_Subarray_With_Sum_K {

	public static int longestSubarrayWithSumK(int[] a, long k) {
		// Write your code here
		Map<Long, Integer> map = new HashMap<Long, Integer>();
		// System.out.println("naren");
		// map.put((long)a[0],0);
		long presum = 0;
		int len = 0;
		for (int i = 0; i < a.length; i++) {
			presum += a[i];
			if (map.containsKey(presum - k)) {
				len = Math.max(len, i - map.get(presum - k));
				map.put(presum, i);
			} else {
				if (!map.containsKey(presum))
					map.put(presum, i);
			}
		}
		return len;
	}

}
