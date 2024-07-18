package A1_Introduction_to_Arrays;
//Problem Description
//
//You are given an integer T (number of test cases). You are given array A and an integer B for each test case. You have to tell whether B is present in array A or not.

//Input Format
//
//        First line of the input contains number of test cases as single integer T .
//        Next, each of the test case consists of 3 lines:
//
//        First line contains a single integer A denoting the length of array
//        Second line contains A integers denoting the array elements
//        Third line contains a single integer B


//Output Format
//
//        For each test case, print on a separate line 1 if the element exists, else print 0.

//Input 1:
//
//        1
//        5
//        4 1 5 9 1
//        5

import java.util.Scanner;

//Output 1:
//
//        1
public class SearchElement {
    // Time COmplex - O(T*N) Space Complex-> O(T+N)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int N = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int test[] = new int[T];
        for (int i = 0; i < T; i++) {
            test[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < T; j++) {
                if (arr[i] == test[j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
