package PrefixSum;

public class Optimized_Equilibrium_Index {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,8,10};
        System.out.println(findEquilibriumIndex(arr));
    }
    // T.C -> O(N) S.C -> O(1)
    public static int findEquilibriumIndex(int A[]){
        int N= A.length;
        int leftSum=0;
        int totalSum=0;
        for (int i = 0; i < N; i++) {
            totalSum=totalSum+A[i];
        }
        int rightSum=totalSum;
        for (int i = 0; i <N ; i++) {
            rightSum=rightSum-A[i];
            if(leftSum==rightSum)
                return i;

            leftSum=leftSum+A[i];
        }
        return -1;
    }
}
