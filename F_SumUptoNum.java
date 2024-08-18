public class F_SumUptoNum {
    public static void main(String[] args) {
        for (;;) {
            java.util.Scanner sc = new java.util.Scanner(System.in);
            System.out.print("Enter a number :");
            int num = sc.nextInt();
            int sum = 0;
            String st = "";
            for (int i = 1; i <= num; i++) {
                if (i <= 1) {
                    st = st + i;
                } else {
                    st = i + "+" + st;
                }
                sum = sum + i;
            }
            System.out.println("Sum from 1 to " + num + " is : " + st + "=" + sum);
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
