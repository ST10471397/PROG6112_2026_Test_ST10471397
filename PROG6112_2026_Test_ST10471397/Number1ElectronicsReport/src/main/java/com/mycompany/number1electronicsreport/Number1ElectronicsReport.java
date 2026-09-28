/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.number1electronicsreport;

/**
 *
 * @author emeris
 */
public class Number1ElectronicsReport {

    public static void main(String[] args) {
        // 1. declare and populate the displays.

        String[] cities = {"Cape Town", "Port Elizabeth", "Pretoria"};

        // [city row] [console row]
        int[][] sales = {
            {1000, 2000, 3000},
            {1000, 2000, 3000},
            {1000, 2000, 3000},};

        // variables used to keep track of the totals.
        int grandTotal;
        int highestTotal = 0;
        String bestCity = "";

        //2. Printing the top part of th report.
        System.out.println("GAMING CONSOLE REPORT");

        System.out.println("--------------------------------");

        System.out.println("            PS5               XBOX                SWITCH");

        //3. loop the displays to print the table
        for (int i = 0; i < cities.length; i++) {
            // prints the cities name then the three number sales.

            System.out.println(cities[i] + "    " + sales[i][0] + "     " + sales[i][1] + "    " + sales[i][2] + "    ");

        }
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("---------------------------------------------------------------------------------------");

        //4. loop again to calculate the totals for eazh city.
        for (int i = 0; i < cities.length; i++) {
            // add the three numbers in the row together

            grandTotal = sales[i][0] + sales[i][1] + sales[i][2];

            // Print the total for this city
            System.out.println(cities[i] + "    " + grandTotal);

            // Check if this is the highest total so far
            if (grandTotal > highestTotal) {
                highestTotal = grandTotal;
                bestCity = cities[i];
            }
        }

        // 5. Print the final result
        System.out.println();
        System.out.println("CITY WITH THE MOST SALES: " + bestCity);
        System.out.println("---------------------------------------------------------");
    }
}
