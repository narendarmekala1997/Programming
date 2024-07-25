package Easy.arrays;

public class Check_if_Array_Is_Sorted_and_Rotated1752 {
	class Solution {
	    public boolean check(int[] nums) {

	        int flag=0;

	        for( int i=1 ; i<nums.length ; i++ ){
	            if(nums[i]>=nums[i-1]){

	            }
	            else if(nums[i]<nums[i-1] && flag==0){
	                flag=1;
	            }
	            else
	            {
	                return false;
	            }
	        }
	        if(flag==1){
	            if(nums[0]>=nums[nums.length-1])
	                return true;
	            else return false;
	        }
	        return true;
	        
	    }
	}

}
