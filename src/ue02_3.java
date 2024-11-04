import java.util.Scanner;

public class ue02_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte geben Sie die x-Koordinate ein: ");
        double xAchse = scanner.nextDouble();

        System.out.print("Bitte geben Sie die y-Koordinate ein: ");
        double yAchse = scanner.nextDouble();

        int radius = 4;

        
        if (xAchse > radius || yAchse > radius) {
            System.out.println("Die Koordinate liegt außerhalb des Quadrats von 4x4 im Quadranten I.");
        }

        
        if (xAchse >= 0 && yAchse >= 0) {
            9            if (Math.pow(xAchse, 2) + Math.pow(yAchse, 2) <= Math.pow(radius, 2)) {
                System.out.println("Der Punkt liegt innerhalb der grünen Fläche.");
            } else {
                System.out.println("Der Punkt liegt außerhalb des Kreises.");
            }
        } else {
            System.out.println("Der Punkt liegt außerhalb des Quadranten I.");
        }
        
        scanner.close();
    }
}
