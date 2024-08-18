public class B_CheckChar {
    public static void main(String[] args) {
        for (;;) {
            java.util.Scanner sc = new java.util.Scanner(System.in);
            System.out.print("Enter a character :");
            char c = sc.next().charAt(0);
            if (c >= 'a' && c <= 'z') {
                System.out.println(c + " is a small alphabet.");
            } else if (c >= 'A' && c <= 'Z') {
                System.out.println(c + " is a big alphabet.");
            } else if (c >= '0' && c <= '9') {
                System.out.println(c + " is a number.");
            } else {
                System.out.println(c + " is a special character..");
            }
            System.out.println("Do you want to continue :");
            System.out.println("Please enter Y or N :");
            char ch = sc.next().charAt(0);
            if (ch == 'Y' || ch == 'y') {
                continue;
            } else {
                sc.close();
                break;
            }
        }
    }
}
