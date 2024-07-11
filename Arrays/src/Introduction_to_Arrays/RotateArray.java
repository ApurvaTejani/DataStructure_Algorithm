package Introduction_to_Arrays;
//Given an Array of size N . Rotate your Array K times

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int arr[]= {4,2,6,3,1};

        System.out.println(Arrays.toString(rotateN(arr,6)));
        System.out.println(Arrays.toString(rotate(arr,6)));
    }
    // Time Complex-> O(N) Space -> O(1)
    public static int[] rotate(int arr[], int k){
        k=k%arr.length;
        int i=0;
        int j= arr.length-1;
        int temp=0;
        while (i < j) {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        i=0;
        j=k-1;
        while(i < j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        i=k;
        j=arr.length-1;
        while(i < j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
return arr;
    }

    // Time Complex-> O(N) Space -> O(N)
    public static int[] rotateN(int arr[],int k){
        k=k%arr.length;
        int result[]= new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[(i+k)%arr.length]=arr[i];
        }
        return result;
    }
}
