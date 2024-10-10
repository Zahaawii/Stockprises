package APIassignment.UI;
import java.util.Scanner;

//Made for CLI design
public class ConsoleOperators {

    static Scanner scanner = new Scanner(System.in);

    public static void displayInfo(String prompt) {
        System.out.println(prompt);
    }

    public static void printSeperator(int n){
        for(int i = 0; i < n; i++)
            System.out.print("-");
        System.out.println();
    }

    public static void pressToContinue() {
        System.out.println("Press anything to continue");
        scanner.nextLine();
        clearConsole();
    }

    public static void clearConsole() {
        for(int i = 0; i < 100; i++) {
            System.out.println();
        }
    }
}
