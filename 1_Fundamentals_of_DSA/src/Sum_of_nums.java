import java.util.Scanner;

public class Sum_of_nums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no= sc.nextInt();
        int sum = (no*(no+1))/2;
        System.out.println("Sum is "+sum);
    }
}
