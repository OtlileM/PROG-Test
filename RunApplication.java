import java.util.Scanner;

public class RunApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] consoleOptions = {"PS5", "XBOX", "SWITCH"};

        System.out.println("Select the console type");
        System.out.println("1) PS5");
        System.out.println("2) XBOX");
        System.out.println("3) SWITCH");

        System.out.print("\n");
        int choice = sc.nextInt();
        sc.nextLine(); // consume enter

        // choose of your choise
        if (choice < 1 || choice > 3) {
            System.out.println("Invalid choice");
            return;
        }

        String selectedConsole = consoleOptions[choice - 1];

        System.out.print("Enter the store: Number 1 Electronics Store: ");
        String storeName = sc.nextLine();
        // If they just press enter, use default from sample
        if (storeName.trim().isEmpty()) {
            storeName = "Number 1 Electronics Store";
        }

        System.out.print("Enter the total sales of " + selectedConsole + " consoles for " + storeName + ": ");
        int totalSales = sc.nextInt();

        
        ConsoleSales sale = new ConsoleSales(selectedConsole, storeName, totalSales);
        sale.printReport();

        sc.close();
    }
}
