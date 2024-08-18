public class L_ArmstrongNumInRangeAlternative {
    public static void main(String[] args) {
        for (;;) {
            java.util.Scanner sc = new java.util.Scanner(System.in);
            System.out.print("Enter lower limit :");
            int l = sc.nextInt();
            System.out.print("Enter upper limit :");
            int u = sc.nextInt();
            int countnum = 0;
            for (int i = l; i <= u; i++) {
                int sum = 0;
                int countdig = 0;
                int temp = i;
                while (i > 0) {
                    countdig += 1;
                    i /= 10;
                }
                i = temp;
                while (i > 0) {
                    int rem = i % 10;
                    int prod = 1;
                    for (int j = 1; j <= countdig; j++) {
                        prod = prod * rem;
                    }
                    sum += prod;
                    i /= 10;
                }
                i = temp;

                if (sum == i) {
                    countnum += 1;
                    if (countnum % 2 != 0) {
                        System.out.print(i + " ");
                    }

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
