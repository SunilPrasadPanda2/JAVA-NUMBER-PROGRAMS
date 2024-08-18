public class R_PhloemNum {
    public static void main(String[] args) {
        int n = 173156;
        int sm = 0;
        int se = 0;
        int temp = n;
        while (n > 0) {
            int rem = n % 10;
            if (se == 0 || n <= 9) {
                se += rem;
            } else {
                sm += rem;
            }
            n /= 10;
        }
        int sumEnd = 0;
        int sumMid = 0;
        if (se > 9) {
            while (se > 0) {
                int rem = se % 10;
                sumEnd += rem;
                se /= 10;
            }
        } else {
            sumEnd = se;
        }
        if (sm > 9) {
            while (sm > 0) {
                int rem = sm % 10;
                sumMid += rem;
                sm /= 10;
            }
        } else {
            sumMid = sm;
        }
        if (sumEnd == sumMid) {
            System.out.println(temp + " is a phloem number.");
        } else {
            System.out.println(temp + " is not a phloem number.");
        }
    }
}
