public class N_AutomorphicNum {
    public static void main(String[] args) {
        for (;;) {
            java.util.Scanner sc = new java.util.Scanner(System.in);
            System.out.print("Enter a number :");
            int num = sc.nextInt();
            int sq = num * num;
            int count = 0;
            int temp = num;
            int sum = 0;
            while (num > 0) {
                num /= 10;
                count += 1;
            }
            int a = 1;
            for (int i = 1; i <= count; i++) {
                int rem = sq % 10;
                sum = sum + rem * a;
                a = a * 10;
                sq /= 10;
            }
            if (sum == temp) {
                System.out.println(temp + " is an Automorphic number.");
            } else {
                System.out.println(temp + " is not an Automorphic number.");
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
