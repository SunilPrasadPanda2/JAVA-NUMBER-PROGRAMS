public class K_StrongNumInRange {
    public static void main(String[] args) {
        for (;;) {
            java.util.Scanner sc = new java.util.Scanner(System.in);
            System.out.print("Enter lower limit :");
            int l = sc.nextInt();
            System.out.print("Enter Upper limit :");
            int u = sc.nextInt();
            for (int i = l; i <= u; i++) {
                int sum = 0;
                int temp = i;
                while (i > 0) {
                    int rem = i % 10;
                    int fac = 1;
                    for (int j = rem; j >= 1; j--) {
                        fac *= j;
                    }
                    sum += fac;
                    i /= 10;
                }
                i = temp;
                /*
                 * We need to do this Because in while loop i value become "0"
                 * After if condition for loop executing i++ expression and if we do not give
                 * temp value to i then in every iteration of for loop i value become 1
                 * and this become a infinite for loop.
                 */
                if (i == sum) {
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
