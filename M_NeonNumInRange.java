public class M_NeonNumInRange {
    public static void main(String[] args) {
        for (;;) {
            java.util.Scanner sc = new java.util.Scanner(System.in);
            System.out.print("Enter lower limit :");
            int l = sc.nextInt();
            System.out.print("Enter upper limit :");
            int u = sc.nextInt();
            for (int i = l; i <= u; i++) {
                int sum = 0;
                int sq = i * i;
                while (sq > 0) {
                    int rem = sq % 10;
                    sum += rem;
                    sq /= 10;
                }
                if (sum == i) {
                    System.out.print(i + " ");
                }
            }
            System.out.println("Do you want to continue :");
            System.out.print("Please enter Yes or No :");
            char c = sc.next().charAt(0);
            if (c == 'y' || c == 'Y') {
                continue;

            } else {
                sc.close();
                break;
            }

        }
    }
}
