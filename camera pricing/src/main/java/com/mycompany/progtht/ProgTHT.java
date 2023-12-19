/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.progtht;

/**
 *
 * @author lab_services_student
 */
public class ProgTHT {
    public static void main(String[] args) {
        String[] manufacturers = {"CANON", "SONY", "NIKON"};
        int[][] cameraPrices = {
            {10500, 8500},
            {9500, 7200},
            {12000, 8000}
        };
        System.out.println("Camera Technology Report");
        System.out.println("...................................................");
        System.out.println("                     MIRRORLESS      DSLR");

        int maxDifference = Integer.MIN_VALUE;
        String maxDifferenceManufacturer = "";

        for (int i = 0; i < manufacturers.length; i++) {
            String manufacturer = manufacturers[i];
            int mirrorlessPrice = cameraPrices[i][0];
            int dslrPrice = cameraPrices[i][1];
            int priceDifference = mirrorlessPrice - dslrPrice;

            System.out.printf("%-10s       R%-6d       R%-6d%n", manufacturer, mirrorlessPrice, dslrPrice);

            if (priceDifference > maxDifference) {
                maxDifference = priceDifference;
                maxDifferenceManufacturer = manufacturer;
            }
        }

        System.out.println("..............................");
        System.out.println("CAMERA TECHNOLOGY RESULTS");
        System.out.println("..............................");

        for (int i = 0; i < manufacturers.length; i++) {
            int mirrorlessPrice = cameraPrices[i][0];
            int dslrPrice = cameraPrices[i][1];
            int priceDifference = mirrorlessPrice - dslrPrice;

            System.out.printf("%-10s R%-5d", manufacturers[i], priceDifference);

            if (manufacturers[i].equals(maxDifferenceManufacturer)) {
                System.out.println("      ***");
            } else {
                System.out.println();
            }
        }

        System.out.println("CAMERA WITH THE MOST PRICE DIFFERENCE: " + maxDifferenceManufacturer);
    }
}
