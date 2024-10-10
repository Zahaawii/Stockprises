package APIassignment.UI;
import java.util.Scanner;

public class UserInterface {

    static Scanner scanner = new Scanner(System.in);

    public static void userDecision() {
        ConsoleOperators.printSeperator(30);
        ConsoleOperators.displayInfo("Welcome to Stock overview");
        ConsoleOperators.printSeperator(30);

        ConsoleOperators.pressToContinue();
        ConsoleOperators.displayInfo("Type the name of the stock you wish to see");
        ConsoleOperators.printSeperator(30);
        String stockName = scanner.nextLine();
    }
}
