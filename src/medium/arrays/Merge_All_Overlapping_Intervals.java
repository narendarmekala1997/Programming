package medium.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Ninja is playing with intervals. He has an array of intervals called ‘Arr’ having ‘N’ intervals.
//
//However, he doesn’t like overlapping intervals. So you must help Ninja by merging all the overlapping intervals in ‘Arr’ and return an array of non-overlapping intervals.
//
//Note:
//Two intervals [L1, R1] and [L2, R2] such that L1 <= L2, are said to be overlapping if and only if L2 <= R1.
//For example:
//For ‘N’ = 4, and 
//‘Arr’ = {{1, 3}, {2, 4}, {3, 5}, {6, 7}}
//We can see that {1, 3} and {2, 4} overlap, so if we merge them, we get {1, 4}.
//Now ‘Arr’ becomes: {{1, 4}, {3, 5}, {6, 7}}
//Still, we observe that {1, 4} and {3, 5} overlap, hence we merge them into {1, 5}.
//Hence, ‘Arr’ becomes {{1, 5}, {6, 7}}.
//Sample Input 1:
//9
//1 2
//1 3
//1 6
//3 4
//4 4
//4 5
//5 5
//6 6
//6 6
//Sample Output 1 :
//1 6
//Explanation Of Sample Input 1:
//Arr after each merge
//{{1, 2}, {1, 3}, {1, 6}, {3, 4}, {4, 4}, {4, 5}, {5, 5}, {6, 6}, {6, 6}}
//{{1, 3}, {1, 6}, {3, 4}, {4, 4}, {4, 5}, {5, 5}, {6, 6}, {6, 6}}
//{{1, 6}, {3, 4}, {4, 4}, {4, 5}, {5, 5}, {6, 6}, {6, 6}}
//{{1, 6}, {4, 4}, {4, 5}, {5, 5}, {6, 6}, {6, 6}}
//{{1, 6}, {4, 5}, {5, 5}, {6, 6}, {6, 6}}
//{{1, 6}, {5, 5}, {6, 6}, {6, 6}}
//{{1, 6}, {6, 6}, {6, 6}}
//{{1, 6}, {6, 6}}
//{{1, 6}}
//Sample Input 2:
//7
//2 2
//2 3
//2 5
//3 6
//4 4
//4 5
//6 6
//Sample Output 2:
//2 6
//Constraints:
//1 <= N <= 10^5
//1 <= L <= R <= 10^9
//
//Time Limit: 1 sec.
public class Merge_All_Overlapping_Intervals {
	
	public static List< List< Integer > > mergeOverlappingIntervals(int [][]arr){

       /* int n = arr.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        for( int i=0  ; i<n ; i++ ){
            int start = arr[i][0];
            int end = arr[i][1];
            if( !ans.isEmpty() && end <= ans.get(ans.size() - 1).get(1)) continue;
            for( int j=i+1 ; j<n ; j++ ){
                if( arr[j][0]<=end ){
                    end = Math.max(end,arr[j][1]);
                }
                else{
                    break;
                }
            }
            List<Integer> temp = new ArrayList<Integer>();
            temp.add(start);
            temp.add(end);
            ans.add(temp);
        }
        return ans;*/
        // Write your code here.
		int n = arr.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        for( int i=0  ; i<n ; i++ ){
            if (ans.isEmpty() || arr[i][0] > ans.get(ans.size() - 1).get(1)) {
                ans.add(Arrays.asList(arr[i][0], arr[i][1]));
            }
            else {
                ans.get(ans.size() - 1).set(1,
                                            Math.max(ans.get(ans.size() - 1).get(1), arr[i][1]));
            }
        }
        return ans;
        // Write your code here.
    }

}
