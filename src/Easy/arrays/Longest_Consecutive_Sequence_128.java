package easy.arrays;

import java.util.Arrays;

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
 

public class Longest_Consecutive_Sequence_128 {

	public int longestConsecutive(int[] a) {
        if(a.length==0) return 0;
        Arrays.sort(a);
        int count=1,longest=1,lastSmaller=Integer.MIN_VALUE;
        for(int i=0 ; i<a.length ; i++ ){

            if(a[i]-1 == lastSmaller){
                count++;
                lastSmaller=a[i];
            }
            else if(a[i] != lastSmaller ){
                count=1;
                lastSmaller=a[i];
            }
           // System.out.println(lastSmaller);
            longest = Math.max(longest, count);
        }
        return longest;
    }
}
