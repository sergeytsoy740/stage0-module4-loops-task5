package school.mjc.stage0.loops.task5;

public class Square {
    public static void printSquareFrom8s(int sideLength){
        String eight = "8  ";
        for (int i = 1; i <= sideLength ; i++) {
            for (int j = 1; j <= sideLength ; j++) {
                if (i == 1 || i == sideLength || j == 1 || j == sideLength) System.out.print(eight);
                else System.out.print("   ");
            }
            System.out.println();
        }
    }
}
