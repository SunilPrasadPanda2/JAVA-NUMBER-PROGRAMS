public class I_PerfectNum {
    public static void main(String[] args) {
        for (;;) {
            java.util.Scanner sc = new java.util.Scanner(System.in);
            System.out.print("Enter a number :");
            int num = sc.nextInt();
            String st = "";
            int sum = 0;
            for (int i = 1; i <= num / 2; i++) {
                if (num % i == 0) {
                    if (sum == 0) {
                        st = st + i;
                    } else {
                        st = i + "+" + st;
                    }
                    sum += i;
                }
            }
            if (num == sum) {
                System.out.println(num + " is a perfect number because ->" + st + "=" + sum);
            } else {
                System.out.println(num + " is not a perfect number.");
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
