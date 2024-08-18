public class D_CheckNoOfDig1 {
    public static void main(String[] args) {
        for (;;) {
            java.util.Scanner sc = new java.util.Scanner(System.in);
            System.out.print("Enter a number :");
            int num = sc.nextInt();
            int count = 0;
            int temp = num;
            while (num > 0) {
                num /= 10;
                count += 1;
            }
            System.out.println(temp + " is a " + count + " digit number.");
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
