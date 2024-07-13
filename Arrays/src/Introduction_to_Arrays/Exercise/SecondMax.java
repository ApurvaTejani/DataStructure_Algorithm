package Introduction_to_Arrays.Exercise;

public class SecondMax {
    public static void main(String[] args) {

        int A[]={20,12,15,19,13,5,13,12,18};
        System.out.println(secondMax(A));
    }
    public static int secondMax(int A[]){
        if(A.length==1){
            return -1;
        }
        int max=A[0];
        for(int i=0;i<A.length;i++)
        {
            if(max<A[i]){
                max=A[i];
            }
        }
        int secondMax=0;
        for(int i=0;i<A.length;i++){
            if(A[i]==max)
                continue;
            else{
                if(secondMax<A[i]){
                    secondMax=A[i];
                }
            }
        }
        return secondMax;
    }
}
