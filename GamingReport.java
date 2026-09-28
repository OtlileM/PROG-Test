public class GamingReport {
    public static void main(String[] args) {
        // Declaration and population of single and two-dimensional arrays 
        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};
        String[] consoles = {"PS5", "XBOX", "SWITCH"};

        // 2D array: rows = cities, columns = console types
        int[][] sales = {
            {1000, 2000, 3000}, // Cape Town
            {2000, 3000, 4000}, // Port Elizabeth
            {1500, 1100, 1200} // Pretoria
        };

        
     int[] totalPerCity = new int[3];

        // Calculating totals of everything
        for (int i = 0; i < sales.length; i++) {
            int total = 0;
            for (int j = 0; j < sales[i].length; j++) {
                total += sales[i][j];
            }
            totalPerCity[i] = total;
        }

        // Determine a city with most sales 
        int maxSales = totalPerCity[0];
        int maxIndex = 0;
        for (int i = 1; i < totalPerCity.length; i++) {
            if (totalPerCity[i] > maxSales) {
                maxSales = totalPerCity[i];
                maxIndex = i;
            }
        }
 
      System.out.println("-----------------------------------------------------");
      System.out.println("GAMING CONSOLE REPORT");
      System.out.println("-----------------------------------------------------");
      System.out.printf("%-20s %-10s %-10s\n", "", "PS5", "XBOX", "SWITCH");
      System.out.println("-----------------------------------------------------");

        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-20s %-10d %-10d %-10d\n", cities[i].toUpperCase(), sales[i][0], sales[i][1], sales[i][2]);
        }

        // Printing of data and calculation of totals
        System.out.println("\n-----------------------------------------------------");
      System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
       System.out.println("-----------------------------------------------------");
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-20s %d\n", cities[i].toUpperCase(), totalPerCity[i]);
        }

   System.out.println("\nCITY WITH THE MOST SALES: " + cities[maxIndex].toUpperCase());
   System.out.println("-----------------------------------------------------");
    }
}