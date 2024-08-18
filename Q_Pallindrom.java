public class Q_Pallindrom {
    public static void main(String[] args) {
        for (;;) {
            java.util.Scanner sc = new java.util.Scanner(System.in);
            System.out.print("Enter a number :");
            int num = sc.nextInt();
            int sum = 0;
            int temp = num;
            while (num > 0) {
                int rem = num % 10;
                sum = (sum * 10) + rem;
                num /= 10;
            }
            if (temp == sum) {
                System.out.println(temp + " is a pallindrom.");
            } else {
                System.out.println(temp + " is not a pallindrom.");
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
