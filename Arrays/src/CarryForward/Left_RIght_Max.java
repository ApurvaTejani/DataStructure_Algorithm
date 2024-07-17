package CarryForward;

import java.util.Arrays;
// Array of N interger . For Every index i, leftMax[i]-> max[0->i]
 public class Left_RIght_Max {
    public static void main(String[] args) {
        int A[]={-3,6,2,4,5,2,8,-9,3,1};
        System.out.println(Arrays.toString(leftMaxArray(A)));
        System.out.println(Arrays.toString(righMaxArray(A)));
    }


    public static int[]  leftMaxArray(int A[]){
        int leftMax[]= new int[A.length];
        leftMax[0]=A[0];
        for (int i = 1; i < A.length ; i++) {
             if (A[i]>leftMax[i-1]) {
                leftMax[i]=A[i];
            } else if (leftMax[i-1]>A[i]) {
                leftMax[i]=leftMax[i-1];
            }
        }
        return leftMax;
    }

    public static int [] righMaxArray(int A[]){
        int N=A.length;
        int rightMax[]=new int [N];
        rightMax[N-1]=A[N-1];
        for (int i = 2; i <= N; i++) {
            if(A[N-i]>rightMax[N-i+1])
                rightMax[N-i]=A[N-i];
            else if (rightMax[N-i+1]>A[N-i]) {
                rightMax[N-i]=rightMax[N-i+1];
            }
        }
        return rightMax;
    }
}
