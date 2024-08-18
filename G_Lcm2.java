public class G_Lcm2 {
    public static void main(String[] args) {
        for (;;) {
            java.util.Scanner sc = new java.util.Scanner(System.in);
            System.out.print("Enter 1st number :");
            int a = sc.nextInt();
            System.out.print("Enter 2nd number :");
            int b = sc.nextInt();
            int n = a > b ? a : b;
            for (int i = n; i <= a * b; i++) {
                if (i % a == 0 && i % b == 0) {
                    System.out.println("Lcm of " + a + " and " + b + " is :" + i);
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
