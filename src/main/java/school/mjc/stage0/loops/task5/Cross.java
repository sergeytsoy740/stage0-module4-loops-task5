package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        String eight = "8  ";
        for (int i = 1; i <= sideLength ; i++) {
            for (int j = 1; j <= sideLength ; j++) {
                if (i == sideLength / 2 + 1 || j == sideLength / 2 + 1) System.out.print(eight);
                else System.out.print("   ");
            }
            System.out.println();
        }
    }
}
