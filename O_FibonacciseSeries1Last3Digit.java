public class O_FibonacciseSeries1Last3Digit {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = a + b;
        int lastnum = a;
        while (c <= 100) {
            lastnum = a;
            a = b;
            b = c;
            c = a + b;
        }
        System.out.println("a=" + lastnum);
        System.out.println("b=" + a);
        System.out.println("c=" + b);
    }
}
