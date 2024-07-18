package CarryForward;
//Given an Array of size N. Find the length of the shortest range which contains both min and max of complete Array.
public class ShortestRange {
    public static void main(String[] args) {
        int arr[]={7,2,1,6,7,1,3,4,1};
        System.out.println(findShortestRange(arr));
        System.out.println(optimizedFindShortestRange(arr));
    }

    public static int optimizedFindShortestRange(int A[]){
        int min=findMin(A);
        int max=findMax(A);
        int closestMin=0;
        int ans1=Integer.MAX_VALUE;
        int ans2=Integer.MAX_VALUE;
        for (int i = A.length-1; i >=0 ; i--) {
            if(A[i]==min)
                closestMin=i;
            else if(A[i]==max) {
                if(ans1>(closestMin-i + 1)&& closestMin!=0) {
                    ans1 = closestMin-i + 1;
                }
            }
        }
        closestMin=0;
        for (int i = A.length-1; i >=0 ; i--) {
            if(A[i]==max)
                closestMin=i;
            else if(A[i]==min) {
                if(ans2>(closestMin-i + 1) && closestMin!=0) {
                    ans2 = closestMin-i + 1;
                }
            }
        }
        System.out.println(ans1+" "+ans2);
        return (ans1<ans2?ans1:ans2);
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
