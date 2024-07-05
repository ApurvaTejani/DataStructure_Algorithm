package Introduction_to_Arrays;
//Given an array of size N . Find the count of elements which has atleast one greater element.

import static java.lang.Math.max;

public class FindCount {
    public static void main(String[] args) {
        int arr[]={-3,-2,7,2,7,4};
        System.out.println(findCount(arr));
    }

    public static  int findCount(int[] arr){

       // here the time complexity is N
        int mx=arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }
        int count=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==mx)
                count++;
        }
        return arr.length-count;
    }
}
