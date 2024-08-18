public class A_4SumOfSquareOfDigits {
    public static void main(String[] args) {
        for (;;) {
            java.util.Scanner sc = new java.util.Scanner(System.in);
            System.out.print("Enter a number :");
            int num = sc.nextInt();
            int sumsq = 0;
            String st = "";
            int temp = num;
            while (num > 0) {
                int rem = num % 10;
                int sq = rem * rem;
                if (sumsq == 0) {
                    st = st + sq;
                    sumsq += sq;
                } else {
                    st = sq + "+" + st;
                    sumsq += sq;
                }
                num /= 10;
            }
            System.out.println("Sum of Square Of each digit of " + temp + " is: " + st + " =" + sumsq);
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
