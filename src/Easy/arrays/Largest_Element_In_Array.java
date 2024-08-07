package easy.arrays;
//Given an array arr, the task is to find the largest element in it.
class Solution {
    public static int largest(int n, int[] arr) {

        int largest=arr[0];
        for(int i=1 ; i<n ; i++ ){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        
        return largest;
    }
}
