package CarryForward;

// Given a String of lowercase english alphabet where i<j and arr[i]='a' & arr[i]='g'
public class CountPairs {
    public static void main(String[] args) {
        String str="abegag";
        System.out.println(countPair(str));
    }
    // T.C -> O(N*N) S.C->O(1)
    public static int countPair(String str){
        char[]A=str.toCharArray();
        int count=0;
        for (int i = 0; i < A.length; i++) {
            if(A[i]!='a')
                continue;
            else{
                for (int j = i+1; j < A.length; j++) {
                    if(A[j]=='g')
                        count++;
                }
            }
        }
        return count++;
    }
}
