package medium.arrays;

import java.util.ArrayList;

public class Intersection_of_Two_Arrays {
	public static ArrayList<Integer> findArrayIntersection(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2,
			int m) {
		// Write Your Code Here.
		ArrayList<Integer> temp = new ArrayList<Integer>();
		int i = 0, j = 0;
		while (i < n && j < m) {
			if (arr1.get(i) < arr2.get(j)) {

				i++;
			} else if (arr2.get(j) < arr1.get(i)) {
				j++;
			} else {
				temp.add(arr1.get(i));
				i++;
				j++;
			}
		}
		return temp;
	}

}
