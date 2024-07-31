package medium.arrays;

import java.util.ArrayList;

//Problem statement
//You have been given an array/list 'arr' consisting of 'n' elements.
//
//
//
//Each element in the array is either 0, 1 or 2.
//
//
//
//Sort this array/list in increasing order.
//
//
//
//Do not make a new array/list. Make changes in the given array/list.
//
//
//
//Example :
//Input: 'arr' = [2, 2, 2, 2, 0, 0, 1, 0]
//
//Output: Final 'arr' = [0, 0, 0, 1, 2, 2, 2, 2]
//
//Explanation: The array is sorted in increasing order.
public class Sort_An_Array_of_0s_1s_and_2s {
	
	public static void sortArray(ArrayList<Integer> arr, int n) {
        int mid=0,low=0,high=n-1;
        while(mid <= high){
            int ele= arr.get(mid);
            if( ele==0 ){
               int temp = arr.get(low);
               arr.set(low,arr.get(mid));
               arr.set(mid,temp);
                mid++;
                low++;
            }
            else if(ele==1){
                mid++;
            }
            else{
                int temp = arr.get(high);
               arr.set(high,arr.get(mid));
               arr.set(mid,temp);
                high--;
            }
        }
    }

}
