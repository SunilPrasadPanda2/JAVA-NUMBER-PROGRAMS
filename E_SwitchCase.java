public class E_SwitchCase {
    public static void main(String[] args) {
        for (;;) {
            java.util.Scanner sc = new java.util.Scanner(System.in);
            System.out.println("Choose your choice :");
            System.out.println("1-Addition");
            System.out.println("2-Sunstraction");
            System.out.println("3-Multiplication");
            System.out.println("4-Division");
            System.out.print("Enter your choice :");
            int ch = sc.nextInt();

            switch (ch) {
                case 1: {
                    System.out.print("Enter 1st number:");
                    int a = sc.nextInt();
                    System.out.print("Enter 2nd number:");
                    int b = sc.nextInt();
                    int sum = a + b;
                    System.out.println("Sum of " + a + " and " + b + " is :" + sum);
                }
                    break;
                case 2: {
                    System.out.print("Enter big number:");
                    int a = sc.nextInt();
                    System.out.print("Enter small number:");
                    int b = sc.nextInt();
                    int substraction = a + b;
                    System.out.println("Substraction of " + b + " from " + a + " is :" + substraction);
                }

                    break;
                case 3: {
                    System.out.print("Enter 1st number:");
                    int a = sc.nextInt();
                    System.out.print("Enter 2nd number:");
                    int b = sc.nextInt();
                    int multiplication = a * b;
                    System.out.println("Multiplication of " + a + " with " + b + " is :" + multiplication);
                }
                    break;
                case 4: {
                    System.out.print("Enter divisor:");
                    int a = sc.nextInt();
                    System.out.print("Enter divisor");
                    int b = sc.nextInt();
                    int division = a / b;
                    System.out.println("Division of " + a + " with " + b + " is :" + division);
                }
                    break;
                default:
                    System.out.println("Please a given option.");
                    break;
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
