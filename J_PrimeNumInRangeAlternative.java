public class J_PrimeNumInRangeAlternative {
    public static void main(String[] args) {
        for (;;) {
            java.util.Scanner sc = new java.util.Scanner(System.in);
            System.out.print("Enter lower limit :");
            int l = sc.nextInt();
            System.out.print("Enter upper limit :");
            int u = sc.nextInt();
            int count = 0;
            for (int i = l; i <= u; i++) {
                if (i <= 1) {
                    continue;
                }
                boolean flag = true;
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag == true) {
                    count += 1;
                    if (count % 2 != 0) {
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
