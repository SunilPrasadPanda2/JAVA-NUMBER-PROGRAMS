public class H_BinaryToNum2 {
    public static void main(String[] args) {
        for (;;) {
            java.util.Scanner sc = new java.util.Scanner(System.in);
            System.out.print("Enter a binary number :");
            int num = sc.nextInt();
            int sum = 0;
            int i = 1;
            int temp = num;
            while (num > 0) {
                int rem = num % 10;
                sum += rem * i;
                num /= 10;
                i *= 2;
            }
            System.out.println("Decimal value of " + temp + " is : " + sum);
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
