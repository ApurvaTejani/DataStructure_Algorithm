package PrefixSum;

import java.util.Scanner;

//Given an Array of size N. Find the Equilibrium index
public class Equilibrium_index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int A[]= new int[N]; // 2 3 4 5 6 3 0
        for (int i = 0; i < N; i++) {
            A[i]=sc.nextInt();
        }
        int pf[]= new int[N];
        pf[0]=A[0];
        for (int i = 1; i <N ; i++) {
            pf[i]=pf[i-1]+A[i];
        }
        int ei=Integer.MIN_VALUE;
        for (int i = 0; i <N ; i++) {
           if(i==0){
                if(pf[N-1]-pf[0]==0) {
                    ei = i;
                    break;
                }
            }
           else if(i==N-1){
               if(pf[N-2]==0){
                   ei = i;
                   break;
               }
           }
            else if(pf[i-1]==(pf[N-1]-pf[i])) {
               ei = i;
               break;
           }
        }
        if(ei==Integer.MIN_VALUE){
            System.out.println("No Equilibrium index Found");
        }
        else {
            System.out.println("Equilibrium index is " + ei);
        }
    }


}
