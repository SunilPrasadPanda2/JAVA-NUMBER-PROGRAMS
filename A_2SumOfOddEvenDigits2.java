public class A_2SumOfOddEvenDigits2 {
    public static void main(String[] args) {
        for (;;) {
            java.util.Scanner sc = new java.util.Scanner(System.in);
            System.out.print("Enter a number :");
            int num = sc.nextInt();
            String stodd = "";
            String steven = "";
            int sumodd = 0;
            int sumeven = 0;
            int temp = num;
            while (num > 0) {
                int rem = num % 10;
                if (rem % 2 != 0) {
                    if (sumodd == 0) {
                        stodd = stodd + rem;
                    } else {
                        stodd = rem + "+" + stodd;
                    }
                    sumodd += rem;
                } else {
                    if (sumeven == 0) {
                        steven = steven + rem;
                    } else {
                        steven = rem + "+" + steven;
                    }
                    sumeven += rem;
                }
                num /= 10;
            }
            System.out.println("Sum of even digits of " + temp + " is :" + steven + "=" + sumeven);
            System.out.println("Sum of odd digits of " + temp + " is :" + stodd + "=" + sumodd);
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
