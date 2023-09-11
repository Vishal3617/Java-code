class TestQuestion {
    public static void main(String s[]) {
        for (int p = 1; p <= 2; p++) {
            for (int q = 1; q <= 3; q++) {
                if (p == q)
                    continue;
                System.out.print(p);
                System.out.println(q);
            }
        }
    }
}
