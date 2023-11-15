package school.mjc.stage0.loops.task5;

public class Cross {
    public static void printCross(int sideLength) {
        double doubleMiddle = sideLength / 2;
        int intMiddle = (int) doubleMiddle;
        for (int i = 0; i < sideLength; i++) {
            for (int j = 0; j < sideLength; j++) {
                if (j == intMiddle || i == intMiddle) {
                    System.out.print(8);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printCross(5);
    }
}

