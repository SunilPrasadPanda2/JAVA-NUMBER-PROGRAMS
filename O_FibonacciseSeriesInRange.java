public class O_FibonacciseSeriesInRange {
    public static void main(String[] args) {
        for (;;) {
            java.util.Scanner sc = new java.util.Scanner(System.in);
            System.out.print("Enter lower limit :");
            int low = sc.nextInt();
            System.out.print("Enter upper limit :");
            int upp = sc.nextInt();
            int x = 0;
            int y = 1;
            int z;
            while (x <= upp) {
                if (x >= low) {
                    System.out.print(x + " ");
                }
                z = x + y;
                x = y;
                y = z;
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
