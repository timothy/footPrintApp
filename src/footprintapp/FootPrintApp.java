/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footprintapp;

/**
 *
 * @author tim
 */
public class FootPrintApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        CarbonFootprint building = new Building(100, 100);
        CarbonFootprint car = new Car(100, 100);
        CarbonFootprint bicycle = new Bicycle(100);

        CarbonFootprint[] array = new CarbonFootprint[3];

        array[0] = building;
        array[1] = car;
        array[2] = bicycle;

        for (CarbonFootprint i : array) {
            System.out.println(i.getCarbonFootPrint());
        }
    }
}
