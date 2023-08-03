package school.mjc.stage0.loops.task5;

public class Hourglass {

    public void printHourglassOfGivenSize(int height) {
        if (height == 0) System.out.println("");
        else {
            String eight = "8";

            for (int i = 1; i <= height; i += 2) {//top
                for (int k = 1; k < i; k += 2) {
                    System.out.print(" ");
                }
                for (int j = i; j <= height; j++) {
                    System.out.print(eight);
                }
                System.out.println();
            }
            for (int i = 1; i < height; i += 2) {//bottom
                for (int j = i + 1; j < (height - 1); j += 2) {
                    System.out.print(" ");
                }

                if (height % 2 != 0) {
                    for (int k = 1; k <= i + 2; k++) {
                        System.out.print(eight);
                    }
                }
                if (height % 2 == 0) {
                    for (int k = 1; k <= i + 1; k++) {
                        System.out.print(eight);
                    }
                }
                System.out.println();
            }
        }
    }
}

