public class G_Hcf {
    public static void main(String[] args) {
        for (;;) {
            java.util.Scanner sc = new java.util.Scanner(System.in);
            System.out.print("Enter 1st number :");
            int a = sc.nextInt();
            System.out.print("Enter 2nd number :");
            int b = sc.nextInt();
            int n = a < b ? a : b;
            while (true) {
                if (a % n == 0 && b % n == 0) {
                    break;
                }
                n--;
            }
            System.out.println("Hcm of " + a + " and " + b + " is :" + n);
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
