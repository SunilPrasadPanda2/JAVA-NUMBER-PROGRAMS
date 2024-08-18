import java.util.Scanner;

public class Y_UniqueNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        boolean flag = true;
        while (n > 0) {
            int rem1 = n % 10;
            int temp = n / 10;
            while (temp > 0) {
                int rem2 = temp % 10;
                if (rem1 == rem2) {
                    System.out.println("It is not a unique number");
                    flag = false;
                    break;
                }
                temp /= 10;
            }
            if (flag == false) {
                break;
            }
            n /= 10;
        }
        if (flag == true) {
            System.out.println("It is a unique number");
        }
        sc.close();
    }
}
