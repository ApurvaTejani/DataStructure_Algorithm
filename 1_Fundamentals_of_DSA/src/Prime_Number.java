import Time_and_Memory.TMClass;

import java.util.Map;
import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = 2000000000;
//        long N = 25;
        long count = 0;

        Map<String, Long> tm1 = TMClass.time_Memory_Used();

        // Version-1 (n) iterations - Time taken goes upto 16 secs
//        for (int i = 1; i  <= N; i++) {
//
//            if (N % i == 0) {
//                    count ++;
//            }
//        }


        //Version-2 sqrt(n) iterations - Time taken almost - in milliseconds
        for (int i = 1; i*i  <= N; i++) {

            if (N % i == 0) {
                if (i * i == N) {
                    count++; // Perfect square case
                } else
                    count += 2;
            }
        }

        Map<String, Long> tm2 = TMClass.time_Memory_Used();
        System.out.println(count);
        if (count == 2)
            System.out.println("Number is prime");
        else
            System.out.println("Number is not prime");
        double timeTaken=(tm2.get("t")-tm1.get("t"))/1000;
        double memUsed=tm2.get("m")-tm1.get("m");

        System.out.println("Time taken " + timeTaken + " secs and Memory used " + memUsed);
    }
}
