import static java.lang.System.*;
import java.util.Scanner;

class Main {
    public static void main( String[] args ) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Iteration size: 1/");
        int response = keyboard.nextInt();
        Gridpi calculator = new Gridpi(response);
        System.out.println("\n");
        double output = calculator.getPi();
        System.out.print("Pi = ");
        System.out.print(output);
    }
}