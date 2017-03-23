/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footprintapp;

/**
 * Application logic for printing out different types of Carbon Footprints.
 *
 * @author Timothy Bradford
 */
public class FootPrintApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CarbonFootprint[] array = new CarbonFootprint[3];

        try {
            CarbonFootprint car = new Car(100, -100);
            CarbonFootprint bicycle = new Bicycle(100);
            CarbonFootprint building = new Building(-10, 0);

            array[0] = building;
            array[1] = car;
            array[2] = bicycle;

            for (CarbonFootprint i : array) {
                System.out.println(i.getClass().getSimpleName());
                System.out.println("Carbon Foot Print:" + i.getCarbonFootPrint());
                System.out.print("\n");
            }

        } catch (IllegalArgumentException e) {
            System.err.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.err.println(e.toString());
            System.err.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        } finally {
            //Why does this happen before the catch?
        }

    }
}
