package PrefixSum;

import java.util.Scanner;

public class Sum_Even_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int N= sc.nextInt();
        int A[]=new int[N];
        System.out.print("Enter the elements of Arrays: ");
        for (int i = 0; i <N ; i++) {
            A[i]=sc.nextInt();
        }
        int pfe[]= new int[N];
        pfe[0]=A[0];
        int pfo[]= new int[N];
        pfo[0]=0;
        for (int i = 1; i < N; i++) {
            if(i%2==0){
                pfe[i]=pfe[i-1]+A[i];
            }
            if(i%2==1){
                pfe[i]=pfe[i-1];
            }
        }
        for (int i = 1; i < N; i++) {
            if(i%2==1){
                pfo[i]=pfo[i-1]+A[i];
            }
            if(i%2==0){
                pfo[i]=pfo[i-1];
            }
        }
        System.out.println("Enter the no of queries ");
        int q= sc.nextInt();
        int sum=0;
        for (int i = 0; i <q ; i++) {
            System.out.println("Enter the start element ");
            int s=sc.nextInt();
            System.out.println("Enter the end element ");
            int e=sc.nextInt();
            System.out.println("Type 1 for Sum of Even indices");
            System.out.println("Type 2 for Sum of Odd indices");
            int type= sc.nextInt();
            if(type==1){
               if(s!=0){
                   sum=pfe[e]-pfe[s-1];
               }
               else {
                   sum=pfe[e];
               }
            }
            if(type==2){
                if(s!=0){
                    sum=pfo[e]-pfo[s-1];
                }
                else {
                    sum=pfo[e];
                }
            }
            System.out.println("Sum is "+sum);
        }


    }
}
