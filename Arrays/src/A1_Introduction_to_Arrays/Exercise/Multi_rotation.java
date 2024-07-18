package A1_Introduction_to_Arrays.Exercise;

import java.util.Arrays;

public class Multi_rotation {
    public static void main(String[] args) {
int arr[]={1,2,3,4,5};
int rotations[]={2,3};

        System.out.println(Arrays.deepToString(solve(arr,rotations)));
    }
    public static int[][] solve(int[] A, int[] B) {
        int result[][]= new int[B.length][A.length];
        for(int i=0;i<B.length;i++){
            int K=B[i];
            K=K%A.length;
            for(int j=0;j<A.length;j++){
                result[i][((j-K)+A.length)%A.length]=A[j];
            }
        }
        return result;
    }
}
