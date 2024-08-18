public class L_ArmstrongNum {
    public static void main(String[] args) {
        for (;;) {
            java.util.Scanner sc = new java.util.Scanner(System.in);
            System.out.print("Enter a number :");
            int num = sc.nextInt();
            int sum = 0;
            int temp = num;
            int count = 0;
            while (num > 0) {
                count += 1;
                num /= 10;
            }
            num = temp;
            while (num > 0) {
                int rem = num % 10;
                int prod = 1;
                for (int i = 1; i <= count; i++) {
                    prod = prod * rem;
                }
                sum += prod;
                num /= 10;
            }
            if (temp == sum) {
                System.out.println(temp + " is an Armstrong number");
            } else {
                System.out.println(temp + " is not an Armstrong number");
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
