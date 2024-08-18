import java.util.Scanner;

public class I_PerfectNumMix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lower limit:");
        int l = sc.nextInt();
        System.out.print("Enter upper limit:");
        int u = sc.nextInt();
        int count = 0;
        int sumHighest = 0;
        for (int i = u; i >= l; i--) {
            int sum = 0;
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == i) {
                count += 1;
                if (count == 1) {
                    while (i > 0) {
                        int rem = i % 10;
                        sumHighest += rem;
                        i /= 10;
                        if (i == 0 && sumHighest > 9) {
                            i = sumHighest;
                            sumHighest = 0;
                        }
                    }
                }
            }
        }
        System.out.println(sumHighest);
        sc.close();
    }
}
