package medium.arrays;

import java.util.ArrayList;
import java.util.List;

//Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
//
//
//
//Example 1:
//
//Input: nums = [3,2,3]
//Output: [3]
//Example 2:
//
//Input: nums = [1]
//Output: [1]
//Example 3:
//
//Input: nums = [1,2]
//Output: [1,2]

public class Majority_Element_LeetCode {
	
	public List<Integer> majorityElement(int[] nums) {

        List<Integer> result = new ArrayList<Integer>();
        int ele1=Integer.MIN_VALUE,ele2=Integer.MIN_VALUE,count1=0,count2=0;

        for( int i=0 ; i<nums.length ; i++ ){

            if( count1==0 && ele2!=nums[i] ){
                count1=1;
                ele1=nums[i];
            }
            else if( count2==0 && ele1!=nums[i] ){
                count2=1;
                ele2=nums[i];
            }
            else if( ele1==nums[i] )count1++;
            else if( ele2==nums[i] )count2++;
            else {
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        for( int i=0 ; i<nums.length ; i++ ){
            if(ele1==nums[i])count1++;
            if(ele2==nums[i])count2++;
        }
        int min = (nums.length/3)+1;
        if(count1>=min) result.add(ele1);
        if(count2>=min) result.add(ele2);
        return result;
        
    }

}
