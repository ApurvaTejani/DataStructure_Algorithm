package Introduction_to_Arrays.Exercise;
//Problem Description
//        You are given an array of integers A of size N.
//        Return the difference between the maximum among all even numbers of A and the minimum among all odd numbers in A.

//Input Format
//        The first argument given is the integer array, A.

//        Output Format
//        Return maximum among all even numbers of A - minimum among all odd numbers in A.

public class MinimumPicks {
    public static void main(String[] args) {

        int arr[]= {-15,-45,43,23,-63,69,35,19,37,-52};

        System.out.println(minimumPicks(arr));
    }

    public static int minimumPicks(int A[]){
        int maxE=Integer.MIN_VALUE;
        int minO=Integer.MAX_VALUE;
        for (int i = 0; i <A.length; i++) {
            if(A[i]%2==0){
                if(maxE<A[i])
                    maxE=A[i];
            } else if (A[i]%2==1 || A[i]%2==-1) {
                if(minO>A[i])
                    minO=A[i];
            }
        }
        return maxE-minO;
    }
}
