package A2_PrefixSum;
// Q - Given an array of size N and Q queries of the format s(start index) and e( end of index)
// return the sum of elements from index s to e

import java.util.Scanner;

public class Sum_between_Intervals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        int A[]= new int[N];
        for (int i = 0; i <N ; i++) {
            A[i]=sc.nextInt();
        }
        int pf[]= new int[N];
        pf[0]=A[0];
        for (int i = 1; i <N ; i++) {
            pf[i]=pf[i-1]+A[i];
        }
        int q=sc.nextInt();
        int sum=0;
        for (int i = 0; i <q ; i++) {
            int s = sc.nextInt();
            int e= sc.nextInt();
            if(s==0){
                sum=pf[e];
            }
            else {
                sum=pf[e]-pf[s-1];
            }
            System.out.println("Sum is "+sum);
        }
    }

}
