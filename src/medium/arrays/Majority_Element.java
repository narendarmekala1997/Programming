package medium.arrays;

import java.util.ArrayList;
import java.util.List;

//Problem statement
//Given an array ‘A’ of ‘N’ integers, find the majority elements of the array.
//
//A majority element in an array ‘A’ of size ‘N’ is an element that appears more than floor(N / 3) times.
//
//Note: The floor function returns the number rounded down to the nearest integer.
//
//Note: Return the array of majority elements in sorted order.
//
//Example:
//Input: ‘N’ = 9 ‘A’ = [2, 2, 1, 3, 1, 1, 3, 1, 1]
//
//Output: 1
//
//Explanation: The frequency of ‘1’ is 5, which is greater than floor(N / 3), hence ‘1’ is the majority element.

public class Majority_Element {
	
	public static List< Integer > majorityElement(int []v) {
        // Write your code here
        List<Integer> result = new ArrayList<Integer>();

        int ele1=Integer.MIN_VALUE,ele2=Integer.MIN_VALUE,count1=0,count2=0;
        for( int i=0 ; i<v.length ; i++){
            if( count1==0 && v[i]!=ele2 ){
                count1=1;
                ele1=v[i];
            }
            else if( count2==0 && v[i]!=ele1 ){
                count2=1;
                ele2=v[i];
            }
            else if( ele1==v[i] ){
                count1++;
            }
            else if( ele2==v[i] ){
                count2++;
            }
            else {
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        for( int i=0 ; i<v.length ; i++ ){
            if( ele1==v[i] )count1++;
            if( ele2==v[i] )count2++;
        }
        int min = (v.length/3) + 1;
        if( count1>=min )
            result.add(ele1);
        if( count2>=min )
            result.add(ele2);
        return result;
    }

}
