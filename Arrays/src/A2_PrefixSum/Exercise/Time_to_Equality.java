package A2_PrefixSum.Exercise;
//Problem Description
//        Given an integer array A of size N. In one second, you can increase the value of one element by 1.
//
//        Find the minimum time in seconds to make all elements of the array equal.
//
//
//        Problem Constraints
//        1 <= N <= 1000000
//        1 <= A[i] <= 1000
//
//
//        Input Format
//        First argument is an integer array A.
//
//
//        Output Format
//        Return an integer denoting the minimum time to make all elements equal.
//
//
//        Example Input
//        A = [2, 4, 1, 3, 2]
//
//
//        Example Output
//        8
public class Time_to_Equality {
    public static void main(String[] args) {
        int A[]={2, 4, 1, 3, 2};
        System.out.println(timeTakenForEquality(A));
    }
    public static int timeTakenForEquality(int A[]){
        int max=0;
        for (int i = 0; i < A.length; i++) {
            if(A[i]>max){
                max=A[i];
            }
        }
        int count=0;
        for (int i = 0; i < A.length; i++) {
            count=count+(max-A[i]);
        }
        return count;
    }
}
