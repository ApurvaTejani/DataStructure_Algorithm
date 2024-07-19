package A3_CarryForward.Exercise;
//Problem Description
//        A wire connects N light bulbs.
//
//        Each bulb has a switch associated with it; however, due to faulty wiring, a switch also changes the state of all the bulbs to the right of the current bulb.
//
//        Given an initial state of all bulbs, find the minimum number of switches you have to press to turn on all the bulbs.
//
//        You can press the same switch multiple times.
//
//        Note: 0 represents the bulb is off and 1 represents the bulb is on.
//Input Format
//        The first and the only argument contains an integer array A, of size N.
//
//        Output Format
//        Return an integer representing the minimum number of switches required.

//Example Input
//        Input 1:
//
//        A = [0, 1, 0, 1] //Output 1 - 4
public class Bulbs {
    public static void main(String[] args) {
        int A[]={0,0,0,0,1,1,1,0,0,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0};
        System.out.println(findCount(A));
    }
    public static int findCount(int A[]){
        int count=0;
        for (int i = 0; i <A.length ; i++) {

            if(A[i]==0){
                A[i]=1;
                for (int j = i+1; j < A.length; j++) {
                    if ((A[j] == 0)) {
                        A[j] = 1;
                    } else {
                        A[j] = 0;
                    }
                }
                count++;
            }
        }
        return count;
    }
}
