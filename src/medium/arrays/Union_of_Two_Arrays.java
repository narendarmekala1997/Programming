package medium.arrays;

import java.util.ArrayList;

/*GGiven two sorted arrays of size n and m respectively, find their union.
 *  The Union of two arrays can be defined as the common and distinct elements in the two arrays.
 *   Return the elements in sorted order.
 *  input: 
	n = 5, arr1[] = {1, 2, 3, 4, 5}  
	m = 5, arr2 [] = {1, 2, 3, 6, 7}
	Output: 
	1 2 3 4 5 6 7
	Explanation: 
	Distinct elements including both the arrays are: 1 2 3 4 5 6 7.
	Input: 
	n = 5, arr1[] = {2, 2, 3, 4, 5}  
	m = 5, arr2[] = {1, 1, 2, 3, 4}
	Output: 
	1 2 3 4 5
	Explanation: 
	Distinct elements including both the arrays are: 1 2 3 4 5.
	n = 5, arr1[] = {1, 1, 1, 1, 1}
	m = 5, arr2[] = {2, 2, 2, 2, 2}
	Output: 
	1 2
	Explanation: 
	Distinct elements including both the arrays are: 1 2.
 */
public class Union_of_Two_Arrays {

	public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {
		// add your code here
		ArrayList<Integer> list = new ArrayList<Integer>();
		int latest = Math.min(arr1[0], arr2[0]);
		list.add(latest);
		int i = 0, j = 0;
		while (i < n && j < m) {
			// System.out.println("nari");
			if (arr1[i] <= arr2[j]) {
				if (latest != arr1[i]) {
					list.add(arr1[i]);
					latest = arr1[i];
				}
				i++;
			} else {
				if (latest != arr2[j]) {
					list.add(arr2[j]);
					latest = arr2[j];
				}
				j++;
			}
		}
		if (i < n) {
			while (i < n) {
				if (latest != arr1[i]) {
					list.add(arr1[i]);
					latest = arr1[i];

				}
				i++;
			}
		}
		if (j < m) {
			while (j < m) {
				if (latest != arr2[j]) {
					list.add(arr2[j]);
					latest = arr2[j];

				}
				j++;
			}
		}

		return list;
	}

}
