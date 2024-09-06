package medium.arrays;

//Problem statement
//You are given an array of ‘N’ integers where each integer value is between ‘1’ and ‘N’. Each integer appears exactly once except for ‘P’, which appears exactly twice, and ‘Q’, which is missing.
//
//
//
//Your task is to find ‘P’ and ‘Q’ and return them respectively.
//Sample Input 1:
//4
//1 2 3 2
//Sample Output 1:
//2 4
//Explanation Of Sample Input 1:
//Input: ‘N’ = 4
//‘A’ = [1, 2, 3, 2]
//Output: {2, 4} - The integer appearing twice is ‘2’, and the integer missing is ‘4’.
//Sample Input 2:
//3
//1 2 1
//Sample Output 2:
//1 3
public class Missing_And_Repeating_Numbers {
	
	public static int[] findMissingRepeatingNumbers(int []a) {
        // Write your code here
        int[] res = new int[2];
        int missing=-1;
        int repeat=-1;
        int temp[] = new int[a.length+1];
        for(int i=0 ; i<a.length ; i++ ){

            temp[a[i]]+=1;
        }
        for(int i=1 ; i<temp.length ; i++ ){

            if(temp[i]==0) missing=i;
            else if(temp[i]==2)repeat=i;
        }
        res[0]=repeat;
        res[1]=missing;
        return res;
    }
	

}
