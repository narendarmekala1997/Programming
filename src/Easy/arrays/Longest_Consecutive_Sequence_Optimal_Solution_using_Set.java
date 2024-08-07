package easy.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
//
//You must write an algorithm that runs in O(n) time.
//
// 
//
//Example 1:
//
//Input: nums = [100,4,200,1,3,2]
//Output: 4
//Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
//Example 2:
//
//Input: nums = [0,3,7,2,5,8,4,6,0,1]
//Output: 9
 

public class Longest_Consecutive_Sequence_Optimal_Solution_using_Set {

	public int longestConsecutive(int[] a) {
		Set<Integer> set = new HashSet<>();
	    
        for( int i=0 ; i<a.length ; i++){
            set.add(a[i]);
        }
        int longest=1;//,cnt=0;
        for( Integer it : set){

            if (!set.contains(it - 1)) {
                // find consecutive numbers
                int cnt = 1;
                int x = it;
                while (set.contains(x + 1)) {
                    x = x + 1;
                    cnt = cnt + 1;
                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;
    }
}
