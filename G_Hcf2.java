public class G_Hcf2 {
    public static void main(String[] args) {
        for (;;) {
            java.util.Scanner sc = new java.util.Scanner(System.in);
            System.out.print("Enter 1st number :");
            int a = sc.nextInt();
            System.out.print("Enter 2nd number :");
            int b = sc.nextInt();
            int n = a < b ? a : b;
            for (int i = n; i >= 1; i--) {
                if (a % i == 0 && b % i == 0) {
                    System.out.println("Hcm of " + a + " and " + b + " is :" + i);
                    break;
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
