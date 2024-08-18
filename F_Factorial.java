public class F_Factorial {
    public static void main(String[] args) {
        for (;;) {
            java.util.Scanner sc = new java.util.Scanner(System.in);
            System.out.print("Enter a number :");
            int num = sc.nextInt();
            int fac = 1;
            String st = "";
            if (num == 0) {
                System.out.println("Factorial of " + num + " is : " + fac);
            } else {
                for (int i = 1; i <= num; i++) {
                    if (i <= 1) {
                        st = st + i;
                    } else {
                        st = i + "*" + st;
                    }
                    fac = fac * i;
                }
                System.out.println("Factorial of " + num + " is : " + st + "=" + fac);
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
