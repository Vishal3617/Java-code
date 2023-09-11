class Student {

    public static void Ten(String args[]) {

        String z = 6;
		int k;

        for (int i = 0; i < 2; i++) {
            z++;

            switch (z) {
                case 3:
                    System.out.print(z = z + 1 + " ");
                case 5:
                    System.out.print(z = z + 2 + " ");
                    break;
                default: {
                    for (int x = 10; x > 3; x++) {
                        System.out.print(x = k + x + " ");
                    }
                }
                case 6:
                    System.out.print(z = z + 4 + " ");
            }
            z--;
        }
    }
}
