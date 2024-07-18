package CarryForward;

public class ShortestRange {
    public static void main(String[] args) {
        int arr[]={1,6,4,2,7,7,5,1,3,1,1,5};
        System.out.println(findShortestRange(arr));
    }
    public static int findShortestRange(int A[]){
        int start=0;
        int end=0;
        int diff1=Integer.MAX_VALUE;
        int diff2=Integer.MAX_VALUE;
        int max=findMax(A);
        int min=findMin(A);
        for (int i = 0; i <A.length ; i++) {
            if(A[i]==min){
                start=i;
                for (int j = i+1; j <A.length ; j++) {
                    if(A[j]==max) {
                        end = j;
                        if(diff1>(end-start+1)) {
                            diff1 = end - start + 1;
                        }
                        break;
                    }
                }
            } else if (A[i]==max) {
                start=i;
                for (int j = i+1; j <A.length ; j++) {
                    if(A[j]==min) {
                        end = j;
                        if(diff2>(end-start+1)) {
                            diff2 = end - start + 1;
                        }
                        break;
                    }
                }
            }
        }
        System.out.println(diff1+" "+diff2);

        return (diff1<diff2?diff1:diff2);
    }

    public static int findMin(int A[]){
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < A.length; i++) {
            if(A[i]<min){
                min=A[i];
            }
        }
        return min;
    }
    public static int findMax(int A[]){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            if(A[i]>max)
                max=A[i];
        }
        return max;
    }
}
