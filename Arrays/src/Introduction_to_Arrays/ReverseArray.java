package Introduction_to_Arrays;

import java.util.Arrays;

//Given an Array of size  N, Reverse the Array without using any extra space
public class ReverseArray {
    public static void main(String[] args) {
        int arr[]={6,2,8,3,9};
        System.out.println(Arrays.toString(reverse(arr)));
    }
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
}
