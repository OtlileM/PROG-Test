public abstract class Consoles implements IConsoles {
    // Variables to store console device type, store name, and total amount
private String consoleType;
private String storeName;
private int totalSales;

    // Constructor that accepts console type, store name, and total amount
    public Consoles(String consoleType, String storeName, int totalSales) {
        this.consoleType = consoleType;
        this.storeName = storeName;
        this.totalSales = totalSales;
    }

    public String getConsoleType() {
        return consoleType;
    }

    public String getStore() {
        return storeName;
    }

    public int getTotalSales() {
        return totalSales;
    }

    // Abstract method for report
    public abstract void printReport();
}