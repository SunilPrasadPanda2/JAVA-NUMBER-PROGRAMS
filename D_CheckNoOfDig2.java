public class D_CheckNoOfDig2 {
    public static void main(String[] args) {
        for (;;) {
            java.util.Scanner sc = new java.util.Scanner(System.in);
            System.out.print("Enter a number :");
            int num = sc.nextInt();
            int count = 0;
            int sum = 0;
            int temp = num;
            while (num > 0) {
                int rem = num % 10;
                sum += rem;
                count += 1;
                num /= 10;
            }
            if (count >= 1) {
                System.out.println(temp + " is a " + count + " digit number.");
                System.out.println("Sum of each digit of " + temp + " is :" + sum);
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
