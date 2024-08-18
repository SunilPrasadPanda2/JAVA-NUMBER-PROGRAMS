public class N_AutomorphicNum2InRange {
    public static void main(String[] args) {
        for (;;) {
            java.util.Scanner sc = new java.util.Scanner(System.in);
            System.out.print("Enter lower limit :");
            int l = sc.nextInt();
            System.out.print("Enter upper limit :");
            int u = sc.nextInt();
            for (int i = l; i <= u; i++) {
                int sq = i * i;
                int temp = i;
                int digit = 1;
                while (i > 0) {
                    i /= 10;
                    digit *= 10;
                }
                i = temp;
                if (sq % digit == i) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
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
