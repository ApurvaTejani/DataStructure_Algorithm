package Introduction_to_Arrays;

import java.util.Arrays;

//Given an Array of size  N, Reverse the Array without using any extra space
public class ReverseArray {
    public static void main(String[] args) {
        int arr[]={6,2,8,3,9};
        System.out.println(Arrays.toString(reverseN(arr)));
        System.out.println(Arrays.toString(reverse(arr)));
    }
    // Time Complexity -> O(N) and Space Complexity -> O(1)
    public static int []reverse(int arr[]){
        int i=0;
        int j=arr.length-1;
        int temp=0;
        while(i<j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return arr;
    }
    // Time Complexity -> O(N) and Space Complexity -> O(N)
    public static int[] reverseN(int A[]){
        int result[] = new int[A.length];
        int j=0;
        for(int i=A.length-1;i>=0;i--){
            result[j]=A[i];
            j++;
        }
        return result;
    }
}
