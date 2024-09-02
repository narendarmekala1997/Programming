package medium.arrays;

import java.util.HashMap;
import java.util.Map;

//Problem statement
//Given an array ‘A’ consisting of ‘N’ integers and an integer ‘B’, find the number of subarrays of array ‘A’ whose bitwise XOR( ⊕ ) of all elements is equal to ‘B’.
//
//A subarray of an array is obtained by removing some(zero or more) elements from the front and back of the array.
//
//Example:
//Input: ‘N’ = 4 ‘B’ = 2
//‘A’ = [1, 2, 3, 2]
//
//Output: 3
//
//Explanation: Subarrays have bitwise xor equal to ‘2’ are: [1, 2, 3, 2], [2], [2].
//Sample Input 1:
//4 2
//1 2 3 2
//Sample Output 1 :
//3
//Explanation Of Sample Input 1:
//Input: ‘N’ = 4 ‘B’ = 2
//‘A’ = [1, 2, 3, 2]
//
//Output: 3
//
//Explanation: Subarrays have bitwise xor equal to ‘2’ are: [1, 2, 3, 2], [2], [2].
//Sample Input 2:
//4 3
//1 2 3 3
//Sample Output 2:
//4
//Sample Input 3:
//5 6
//1 3 3 3 5 
//Sample Output 3:
//2
public class Subarrays_with_XOR_K {
	public static int subarraysWithSumK(int []a, int b) {
        // Write your code here
        int count=0;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        map.put(0, 1);
        int xr = 0;
        
        for( int i=0 ; i<a.length ; i++ ){
            xr = xr^a[i];
            int x = xr ^ b;
            if(map.containsKey(x)){
                count = count + map.get(x);
            }
            if(map.containsKey(xr)){
                map.put(xr,map.getOrDefault(xr, 0)+1);
            }
            else{
                map.put(xr,1);
            }
        }
        return count;
    }
}
