import java.util.Scanner;

public class U_NivenNumInRange {
    // Niven number is aslo called Harshad number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lower limit :");
        int l = sc.nextInt();
        System.out.print("Enter upper limit :");
        int u = sc.nextInt();
        for (int i = l; i <= u; i++) {
            int sum = 0;
            int temp = i;
            while (i > 0) {
                int rem = i % 10;
                sum += rem;
                i /= 10;
            }
            i = temp;
            if (i % sum == 0) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
