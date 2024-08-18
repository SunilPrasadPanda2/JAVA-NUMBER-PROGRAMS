public class K_StrongNum {
    public static void main(String[] args) {
        for (;;) {
            java.util.Scanner sc = new java.util.Scanner(System.in);
            System.out.print("Enter a number :");
            int num = sc.nextInt();
            int sum = 0;
            String st = "";
            int temp = num;
            while (num > 0) {
                int rem = num % 10;
                int fac = 1;
                for (int i = 1; i <= rem; i++) {
                    fac *= i;
                }
                if (sum == 0) {
                    st = st + fac;
                } else {
                    st = fac + "+" + st;
                }
                sum += fac;
                num /= 10;
            }
            if (temp == sum) {
                System.out.println(temp + " is a strong number because " + st + "=" + sum);
            } else {
                System.out.println(temp + " is not a strong number.");
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
