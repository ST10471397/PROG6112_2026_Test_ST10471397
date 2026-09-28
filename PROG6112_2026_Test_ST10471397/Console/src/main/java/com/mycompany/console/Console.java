/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.console;

import java.util.Scanner;

public class Console {

// 1. The Interface
    interface IConsoles {

        String getConsoleType();

        String getStore();

        int getTotalSales();
    }

// 2. The Abstract Class
    abstract class Console implements IConsoles {
        // Variables to store data

        protected String consoleType;
        protected String storeName;
        protected int totalSales;

        // Constructor that accepts parameters
        public Console(String consoleType, String storeName, int totalSales) {
            this.consoleType = consoleType;
            this.storeName = storeName;
            this.totalSales = totalSales;
        }

        // Methods to get the values (implementing the interface)
        @Override
        public String getConsoleType() {
            return consoleType;
        }

        @Override
        public String getStore() {
            return storeName;
        }

        @Override
        public int getTotalSales() {
            return totalSales;
        }
    }

// 3. The Subclass
    class ConsoleSales extends Console {

        // Constructor to accept parameters and pass them to the parent class
        public ConsoleSales(String consoleType, String storeName, int totalSales) {
            super(consoleType, storeName, totalSales);
        }

        // Method to print the report
        public void printReport() {
            System.out.println("\n--- CONSOLE SALES REPORT ---");
            System.out.println("Console Type : " + getConsoleType());
            System.out.println("Store Name   : " + getStore());
            System.out.println("Total Sales  : " + getTotalSales());
            System.out.println("----------------------------");
        }
    }

// 4. The Main Application Class
    public class RunApplication {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // Ask the user for input
            System.out.print("Enter console device type (e.g., PS5, XBOX): ");
            String type = input.nextLine();

            System.out.print("Enter store name: ");
            String store = input.nextLine();

            System.out.print("Enter total amount of sales: ");
            int sales = input.nextInt();

            // Instantiate the ConsoleSales class
            ConsoleSales mySale = new ConsoleSales(type, store, sales);

            // Call the method to print the report
            mySale.printReport();

            input.close();
        }
    }
}
