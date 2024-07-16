package PrefixSum.Exercise;
//Problem Description
//        You are given an integer array A of size N.
//
//        You have to perform B operations. In one operation, you can remove either the leftmost or the rightmost element of the array A.
//
//        Find and return the maximum possible sum of the B elements that were removed after the B operations.
//
//        NOTE: Suppose B = 3, and array A contains 10 elements, then you can:
//
//        Remove 3 elements from front and 0 elements from the back, OR
//        Remove 2 elements from front and 1 element from the back, OR
//        Remove 1 element from front and 2 elements from the back, OR
//        Remove 0 elements from front and 3 elements from the back.

//Input 1:
//
//        A = [2, 3, -1, 4, 2, 1 ]
//        B = 4
//        Output :
//
//        9
//Example 2 -
//[-969,-948,350,150,-59,724,966,430,107,-809,-993,337,457,-713,753,-617,-55,-91,-791,758,-779,-412,-578,-54,506,30,-587,168,-100,-409,-238,655,410,-641,624,-463,548,-517,595,-959,602,-650,-709,-164,374,20,-404,-979,348,199,668,-516,-719,-266,-947,999,-582,938,-100,788,-873,-533,728,-107,-352,-517,807,-579,-690,-383,-187,514,-691,616,-65,451,-400,249,-481,556,-202,-697,-776,8,844,-391,-11,-298,195,-515,93,-657,-477,587] B=81
public class PickBothSides {
    public static void main(String[] args) {
        int A[]={2, 3, -1, 4, 2, 1};
        int B=4;
        System.out.println(maxSum(A,B));
    }

//    The time complexity of the maxSum function is O(N) and the space complexity is also O(N)
    public static int maxSum(int A[],int B){
        int i=B;
        int max=Integer.MIN_VALUE;
        int pff[]= new int[A.length];
        int pfr[]= new int[A.length];
        pff[0]=A[0];
        for (int j = 1; j < A.length; j++) {
            pff[j]=pff[j-1]+A[j];
        }
        int Ar[]= new int[A.length];
        int k=0;
        for (int j = A.length-1; j >=0 ; j--) {
            Ar[k]=A[j];
            k++;
        }
        pfr[0]=Ar[0];
        for (int j = 1;j<A.length ; j++) {
            pfr[j]=pfr[j-1]+Ar[j];
        }
        for (int j = 0; j < B+1; j++) {
            if(j==0){
                if(pff[i-1]>max){
                    max=pff[i-1];
                }
            } else if (i==0) {
                if(pfr[j-1]>max){
                    max=pfr[j-1];
                }
            }
            else{
                if(pff[i-1]+pfr[j-1]>max){
                    max=pff[i-1]+pfr[j-1];
                }
            }
            i--;
        }
        return max;
    }
}
