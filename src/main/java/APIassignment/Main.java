package APIassignment;
import APIassignment.UI.UserInterface;

import java.util.Map;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Brugeren indtaster aktiekoden (f.eks. AAPL for Apple)
        System.out.print("Indtast aktiekoden: ");
        String stockSymbol = scanner.nextLine();

        // Kalder funktionen for at hente aktiepriser
        fetchStock.fetchStockPrices(stockSymbol);
    }

}