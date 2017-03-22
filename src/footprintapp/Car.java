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
public class Car implements CarbonFootprint {

    private double milesDrivenPerYear;
    private double milesPerGallon;

    Car(double milesDrivenPerYear, double milesPerGallon) {
        this.milesDrivenPerYear = milesDrivenPerYear;
        this.milesPerGallon = milesPerGallon;
    }

    public double getMilesDrivenPerYear() {
        return milesDrivenPerYear;
    }

    public void setMilesDrivenPerYear(double milesDrivenPerYear) {
        this.milesDrivenPerYear = milesDrivenPerYear;
    }

    public double getMilesPerGallon() {
        return milesPerGallon;
    }

    public void setMilesPerGallon(double milesPerGallon) {
        this.milesPerGallon = milesPerGallon;
    }

    @Override
    public double getCarbonFootPrint() {
        System.out.println("Miles Per Gallon:" + this.milesPerGallon);
        System.out.println("Miles Driven Per Year:" + this.milesDrivenPerYear);
        return this.milesDrivenPerYear / this.milesPerGallon * 19.82;
    }

}
