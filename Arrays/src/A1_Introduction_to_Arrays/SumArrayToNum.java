package A1_Introduction_to_Arrays;

//Given an Array of N elements. Find count of pairs[i,j] where i*j are indices such that arr[i]+arr[j]=k;
public class SumArrayToNum {
    public static void main(String[] args) {
        int arr[]= {4,2,7,5,1};
       int count= countOfPairs(arr,6);
        System.out.println(count);
    }
    public static int countOfPairs(int arr[],int k){
        int count=0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j]==k)
                    count++;
            }
        }
        return count;
    }
}
