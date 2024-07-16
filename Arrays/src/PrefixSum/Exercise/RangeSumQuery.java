package PrefixSum.Exercise;
//Problem Description
//        You are given an integer array A of length N.
//        You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
//        For each query, you have to find the sum of all elements from L to R indices in A (0 - indexed).
//        More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.


//Input Format
//        The first argument is the integer array A.
//        The second argument is the 2D integer array B.
//
//
//        Output Format
//        Return an integer array of length M where ith element is the answer for ith query in B.

//Example Input
//        Input 1:
//        A = [1, 2, 3, 4, 5]
//        B = [[0, 3], [1, 2]]
//Output 1:
//        [10, 5]

import java.util.Arrays;

public class RangeSumQuery {
    public static void main(String[] args) {
        int A[]={2, 2, 2};
        int B[][]={{0, 0}, {1, 2}};
        System.out.println(Arrays.toString(solve(A,B)));
    }

    // O(N+M) -> Space complexity and O(N+M) -> Time Complexity
    // Make pre fix sum array as Long Data Type
    public static long[] solve(int A[],int B[][]){

        int N= A.length;
        long pf[]= new long[N];
        pf[0]=A[0];
        for (int i = 1; i <N ; i++) {
            pf[i]=pf[i-1]+A[i];
        }
        long result[]= new long[B.length];
        for (int i = 0; i < B.length; i++) {
            int start=B[i][0];
            int end=B[i][1];
            if(start==0){
                result[i]=pf[end];
            }
            else{
                result[i]=pf[end]-pf[start-1];
            }
        }
        return result;
    }
}
