import java.util.Scanner;

public class W_LargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = sc.nextInt();
        int largeDig = 0;
        int smallDit = 9;
        while (n > 0) {
            int rem = n % 10;
            largeDig = largeDig > rem ? largeDig : rem;
            smallDit = smallDit < rem ? smallDit : rem;
            n /= 10;
        }
        System.out.println("Large digit is :" + largeDig);
        System.out.println("Small digit is :" + smallDit);
        sc.close();
    }
}
