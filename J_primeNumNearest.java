import java.util.Scanner;

public class J_primeNumNearest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = sc.nextInt();
        int temp = n;
        int largeNum = n + 1;
        int smallNum = n - 1;
        while (n < largeNum) {
            boolean flag = true;
            for (int i = 2; i <= largeNum / 2; i++) {
                if (largeNum % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                System.out.println("Nearest large prime number :" + largeNum);
                break;
            }
            largeNum += 1;
        }
        n = temp;
        while (n > smallNum) {
            boolean flag = true;
            for (int i = 2; i <= smallNum / 2; i++) {
                if (smallNum % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                System.out.println("Nearest small prime number :" + smallNum);
                break;
            }
            smallNum -= 1;
        }
        sc.close();
    }
}
