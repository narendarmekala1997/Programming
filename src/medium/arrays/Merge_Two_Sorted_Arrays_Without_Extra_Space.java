package medium.arrays;

import java.util.Arrays;

//Problem statement
//Given two non-decreasing sorted arrays, ‘A’ and ‘B’, having ‘N’ and ‘M’ elements, respectively.
//
//
//
//You must merge these arrays, ‘A’ and ‘B’, into a sorted array without using extra space. Of all the 'N + M' sorted elements, array 'A' should contain the first 'N' elements, and array 'B' should have the last 'M' elements.
//
//
//
//Note:
//You must perform the merge operation in place and must not allocate any extra space to merge the two arrays.
//For example:
//When ‘N’ = 4, ‘A’ = {1, 4, 5, 7} and ‘M’ = 3, ‘B’ = {2, 3, 6}. 
//We can merge these two arrays into {1, 2, 3, 4, 5, 6, 7} (The elements of ‘A’ are {1, 2, 3, 4} ).
//Hence, the answer is {1, 2, 3, 4, 5, 6, 7}.
//Detailed explanation ( Input/output format, Notes, Images )
//Sample Input 1:
//3 4
//1 8 8
//2 3 4 5
//Sample Output 1:
//1 2 3 4 5 8 8
//Explanation Of Sample Input 1:
//We have ‘A’ = {1, 8, 8} and ‘B’ = {2, 3, 4, 5}. 
//Merging the two arrays results in {1, 2, 3, 4, 5, 8, 8}.
//Hence the answer is {1, 2, 3, 4, 5, 8, 8}, where ‘A’ contains {1, 2, 3} and ‘B’ contains {4, 5, 8, 8}.
//Sample Input 2:
//4 5
//1 1 1 1 
//2 2 3 3 5
//Sample Output 2:
//1 1 1 1 2 2 3 3 5
//Constraints:
//1 <= N <= 10^5
//1 <= M <= 10^5
//0 <= A[i] <= 10^9
//0 <= B[i] <= 10^9
//
//The sum of ‘N + M’ over all test cases does not exceed 2 * 10^5.
//Time Limit: 1-sec

public class Merge_Two_Sorted_Arrays_Without_Extra_Space {

	public static void mergeTwoSortedArraysWithoutExtraSpace(long[] a, long[] b) {
		// Write your code here.
//		long[] arr = new long[a.length + b.length];
//		int left = 0;
//		int right = 0;
//		int j = 0;
//		while (left < a.length && right < b.length) {
//			if (a[left] < b[right]) {
//				arr[j] = a[left];
//				j++;
//				left++;
//			} else {
//				arr[j] = b[right];
//				j++;
//				right++;
//			}
//		}
//		if (left < a.length) {
//			while (left < a.length) {
//				arr[j] = a[left];
//				j++;
//				left++;
//			}
//		}
//		if (right < b.length) {
//			while (right < b.length) {
//				arr[j] = b[right];
//				j++;
//				right++;
//			}
//		}
//		int index = 0;
//		for (int i = 0; i < a.length; i++) {
//			a[i] = arr[index];
//			index++;
//		}
//		for (int i = 0; i < b.length; i++) {
//			b[i] = arr[index];
//			index++;
//		}
		//without using Extra space
		int m=a.length;
        int n=b.length;
        int left = m-1;
        int right = 0;

        while( left>=0 && right < n ){
            if( a[left] > b[right] ){
                long temp = a[left];
                a[left] = b[right];
                b[right]=temp;
                left--;
                right++;
            }
            else{
                break;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
	}

}
