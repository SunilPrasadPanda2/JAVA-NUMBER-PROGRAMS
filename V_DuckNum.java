import java.util.Scanner;

public class V_DuckNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = sc.nextInt();
        // int temp=n;
        // String st = "";
        int sum = 0;
        int i = 1;
        int temp = n;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + (rem * i);
            i *= 10;
            n /= 10;
        }
        System.out.println(sum);
        System.out.println(i);
        if (temp == sum) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        sc.close();
    }
}
