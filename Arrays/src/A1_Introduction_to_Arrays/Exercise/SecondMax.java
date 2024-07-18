package A1_Introduction_to_Arrays.Exercise;

public class SecondMax {
    public static void main(String[] args) {

        int A[]={4,4,4};
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
        int count=0;
        int secondMax=0;
        for(int i=0;i<A.length;i++){
            if(A[i]==max) {
                count++;
                continue;
            }
            else{
                if(secondMax<A[i]){
                    secondMax=A[i];
                }
            }
        }
        if(count==A.length)
            return -1;
        return secondMax;
    }
}
