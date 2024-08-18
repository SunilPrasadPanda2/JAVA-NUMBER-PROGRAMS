public class N_AutomorphicNum2 {
    public static void main(String[] args) {
        for (;;) {
            java.util.Scanner sc = new java.util.Scanner(System.in);
            System.out.print("Enter a number :");
            int num = sc.nextInt();
            int sq = num * num;
            int temp = num;
            int i = 1;
            while (num > 0) {
                num /= 10;
                i *= 10;
            }
            if (sq % i == temp) {
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
