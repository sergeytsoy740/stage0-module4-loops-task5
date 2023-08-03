package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        String eight = "8";
        for (int i = 1; i <= cathetusLength; i++) {
            if (i == 1 || i == cathetusLength) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(eight);
                }
            } else {
                for (int j = 1; j <= i; j++) {
                    if (j == 1 || j == i) System.out.print(eight);
                    else System.out.print(eight);
                }
            }
            System.out.println();
        }
    }
}
