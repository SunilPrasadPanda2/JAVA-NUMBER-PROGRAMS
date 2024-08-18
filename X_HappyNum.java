import java.util.Scanner;

public class X_HappyNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = sc.nextInt();
        int temp = n;
        int sumsq = 0;
        boolean flag = true;
        while (n > 0) {
            int rem = n % 10;
            int sq = rem * rem;
            sumsq += sq;
            n /= 10;
            if (n == 0 && sumsq > 9) {
                n = sumsq;
                sumsq = 0;
            }
            if (n == 0 && sumsq < 9) {
                if (sumsq == 1) {
                    break;
                } else {
                    flag = false;
                    break;
                }
            }
        }
        if (flag == true && sumsq == 1) {
            System.out.println(temp + " is a happy number");
        } else {
            System.out.println(temp + " is not a happy number");
        }
        sc.close();
    }
}
