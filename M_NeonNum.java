public class M_NeonNum {
    public static void main(String[] args) {
        for (;;) {
            java.util.Scanner sc = new java.util.Scanner(System.in);
            System.out.print("Enter a number :");
            int num = sc.nextInt();
            int sum = 0;
            int sq = num * num;
            while (sq > 0) {
                int rem = sq % 10;
                sum += rem;
                sq /= 10;
            }
            if (num == sum) {
                System.out.println(num + " is a Neon number.");
            } else {
                System.out.println(num + " is not a Neon number.");
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
