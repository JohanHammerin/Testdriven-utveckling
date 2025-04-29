package se.johan.lektion3.uppgift2;

public class Main {
    public static void main(String[] args) {
        buildPyramid(3);
    }

    public static void buildPyramid(int x) {
        String star = "*".repeat(x);
        int oneAbove = 1;
        boolean flag = false;


        for (int i = 0; i <= ((x * 2) - 1); i++) {
            if (oneAbove < x && !flag) {
                System.out.print(star.substring(0, oneAbove));
                oneAbove++;
                if (oneAbove == x) {
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
