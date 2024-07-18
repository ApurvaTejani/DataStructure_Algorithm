package A3_CarryForward;

// Given a String of lowercase english alphabet where i<j and arr[i]='a' & arr[i]='g'
public class CountPairs {
    public static void main(String[] args) {
        String str="bcaggaag";
        System.out.println(countPairN2(str));
        System.out.println(countPairN(str));
    }
    // T.C -> O(N*N) S.C->O(N)
    public static int countPairN2(String str){
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
    // T.C -> O(N) S.C->O(1) //Optimized Code
    public static int countPairN(String str){
        int count=0;
        int ans=0;
        for (int i = str.length()-1; i >=0 ; i--) {
            if(str.charAt(i)=='g')
                count++;
            else if (str.charAt(i)=='a') {
                ans=ans+count;
            }
        }
        return ans;
    }
}
