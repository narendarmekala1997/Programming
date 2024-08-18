package easy.arrays;
//You are given an integer ‘N’. You need to return the first ‘N’ rows of Pascal’s triangle.
//
//Example:
//
//Input:
//N = 4
//Output:
//1
//1 1
//1 2 1
//1 3 3 1
public class Print_Pascals_Triangle {
	public static int[] generateRow(int n){
        int ans=1;
        int[] res = new int[n];
        res[0]=1;
        for( int i=1 ; i<n ; i++){
            ans = ans*(n-i);
            ans = ans/i;
            res[i] = ans;
        }
        return res;
    }
    public static int[][] pascalTriangle(int N) {
        // Write your code here.
        int[][] result = new int[N+1][N+1];
        for(int i=1 ; i<=N ;i++){
            result[i] = generateRow(i);
        }
        int[][] res = new int[N][N];
        for(int i=1 ; i<=N ; i++){
            res[i-1] = result[i];
        }
        return res;
        
    }

}
