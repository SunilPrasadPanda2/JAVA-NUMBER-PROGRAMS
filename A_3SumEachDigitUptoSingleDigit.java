public class A_3SumEachDigitUptoSingleDigit {
    public static void main(String[] args) {
        for (;;) {
            java.util.Scanner sc = new java.util.Scanner(System.in);
            System.out.print("Enter a number :");
            int num = sc.nextInt();
            int sum = 0;
            while (num > 0) {
                int rem = num % 10;
                sum += rem;
                num /= 10;
                if (num == 0 && sum > 9) {
                    num = sum;
                    sum = 0;
                }
            }
            System.out.println("Single digit if we sum each digit is :" + sum);
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
