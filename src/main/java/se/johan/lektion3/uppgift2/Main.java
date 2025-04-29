package se.johan.lektion3.uppgift2;

public class Main {
    public static void main(String[] args) {
        buildPyramid(3);
    }


    // Test
    // 1. Kolla så att height inte är negativt
    // 2. Double
    // 3. flag = true om oneAbove = height

    public static void buildPyramid(int height) {
        String star = "*".repeat(height);
        int oneAbove = 1;
        boolean flag = false;


        for (int i = 0; i <= ((height * 2) - 1); i++) {
            if (oneAbove < height && !flag) {
                System.out.print(star.substring(0, oneAbove));
                oneAbove++;
                if (oneAbove == height) {
                    flag = true;
                }
            } else {
                System.out.print(star.substring(0, oneAbove));
                oneAbove--;
            }

            System.out.println();
        }
    }

}
