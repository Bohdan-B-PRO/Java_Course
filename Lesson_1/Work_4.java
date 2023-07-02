public class Main {
    public static void main(String[] args) {
        for (int q = 0; q <= 9; q++) {
            for (int w = 0; w <= 9; w++) {
                for (int e = 0; e <= 9; e++) {
                    if (q + w == e) {
                        System.out.println(q + " + " + w + " = " + e);
                    }
                }
            }
        }
    }
}