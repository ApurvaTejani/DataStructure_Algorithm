package Introduction_to_Arrays.Exercise;

public class LittlePony {
    public static void main(String[] args) {
        int arr[]={5,3,7,8,1};
        System.out.println(solve(arr,4));
    }
    public static int solve(int[] A, int B) {
        int count=0;
        int op=0;
        for(int i=0;i<A.length;i++){
            if(A[i]==B)
                count++;
            else if(A[i]>B)
                op++;
        }
        if(count==0){
            return -1;
        }
        else{
            return op;
        }
    }
}
