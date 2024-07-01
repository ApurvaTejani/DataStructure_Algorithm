public class Sqrt {
    public static void main(String[] args) {
        int n=98010000;
        int result=0;
        int count=0;

        //Version 1  with sqrt(n) iterations
//        for (int i = 1; i <=n ; i++) {
//            count++;
//            if(i*i==n){
//                result=i;
//                break;
//            }
//        }
        //Version 2 with log of n iterations

            int low = 1;
            int high = n;

            while (low <= high) {
                count++;
                int mid = (low + high) / 2;
                long midSquared = (long)mid * mid;

                if (midSquared == n) {
                    result=mid;
                    break;
                } else if (midSquared < n) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }


        System.out.println(result+" in "+count+" iterations");
    }

}
