package A1_Introduction_to_Arrays.Exercise;

import java.util.Scanner;

//Problem Description
//        You are given an integer T denoting the number of test cases. For each test case, you are given an integer array A.
//
//        You have to print the odd and even elements of array A in 2 separate lines.
//
//        NOTE: Array elements should have the same relative order as in A.
//Input Format
//        First line of the input contains a single integer T.
//
//        For each test case:
//
//        First line consists of a single integer |A| denoting the length of array.
//        Second line consists of |A| space separated integers denoting the elements of array A.
//Output Format
//        For each test case:
//
//        First line should contain an array of space separated integers containing all the odd elements of array A
//        Second line should contain an array of space separated integers containing all the even elements of array A
public class OddEvenWithTestCases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        // Time complexity O(T*N), space complexity O(1)
//T
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
// 3N
            int A[] = new int[N];
            for (int j = 0; j < N; j++) {
                A[j] = sc.nextInt();
            }

            for (int j = 0; j < A.length; j++) {
                if (A[j] % 2 == 1) {
                    System.out.print(A[j] + " ");
                }
            }
            System.out.println();
            for (int j = 0; j < A.length; j++) {
                if (A[j] % 2 == 0) {
                    System.out.print(A[j] + " ");
                }
            }
            System.out.println();


        }
    }
}
