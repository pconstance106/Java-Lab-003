import java.util.Scanner;

public class GettingHotInHere {
    /**
     *
     * @author Trevor Hartman
     * @author Paul Constance
     *
     * @since Version 1.0
     *
     * Teaching Mr. Roboto how to listen to us.
     * @param args Command line arguments [The source file path, The target file path, ...]
     **/
    public static void main(String[] args) {
        // The instantiation code for a Scanner instance.
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the temperature in °F: ");
        int number = scanner.nextInt();

        double celsius = (number - 32.0) * (5.0/9);
        System.out.printf("%d°F", number);
        System.out.printf("%n%.3f°C", celsius);
        System.out.printf("%nIf it were 2°C warmer it would be: %.3f°C",celsius+2);
    }
}
