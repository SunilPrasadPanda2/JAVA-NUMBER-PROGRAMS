public class J_PrimeNum {
    public static void main(String[] args) {
        for (;;) {
            java.util.Scanner sc = new java.util.Scanner(System.in);
            System.out.print("Enter a number :");
            int num = sc.nextInt();
            boolean flag = false;
            if (num <= 1) {
                System.out.println(num + " is not a prime number.");
            } else {
                for (int i = 2; i <= num / 2; i++) {
                    if (num % i == 0) {
                        System.out.println(num + " is not a prime number.");
                        flag = true;
                        break;
                    }
                }
                if (flag == false) {
                    System.out.println(num + " is a prime number.");
                }
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
