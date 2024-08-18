public class H_NumToBinary {
    public static void main(String[] args) {
        for (;;) {
            java.util.Scanner sc = new java.util.Scanner(System.in);
            System.out.print("Enter a number :");
            int num = sc.nextInt();
            String st = "";
            int temp = num;
            while (num > 0) {
                int rem = num % 2;
                st = rem + st;
                num /= 2;
            }
            System.out.println("Binary number of " + temp + " is :" + st);
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
