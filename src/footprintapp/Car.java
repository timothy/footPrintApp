/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footprintapp;

/**
 * The Car class stores miles Driven Per Year and miles Per Gallon then uses
 * them to generate a carbon footprint.
 *
 * @author Timothy Bradford
 */
public class Car implements CarbonFootprint {

    private double milesDrivenPerYear;
    private double milesPerGallon;

    /**
     *
     * @param milesDrivenPerYear the miles Driven Per Year for the car
     * @param milesPerGallon the miles Per Gallon for the car
     * @throws InvalidFootprintException
     */
    Car(double milesDrivenPerYear, double milesPerGallon) {
        if (milesDrivenPerYear >= 0 && milesPerGallon >= 0) {
            this.milesDrivenPerYear = milesDrivenPerYear;
            this.milesPerGallon = milesPerGallon;
        } else {
            throw new InvalidFootprintException();
        }
    }

    /**
     * get the Miles Driven Per Year
     *
     * @return this.milesDrivenPerYear
     */
    public double getMilesDrivenPerYear() {
        return this.milesDrivenPerYear;
    }

    /**
     * set the Miles Driven Per Year
     *
     * @param milesDrivenPerYear
     */
    public void setMilesDrivenPerYear(double milesDrivenPerYear) {
        this.milesDrivenPerYear = milesDrivenPerYear;
    }

    /**
     * get the Miles Per Gallon
     *
     * @return this.milesPerGallon
     */
    public double getMilesPerGallon() {
        return this.milesPerGallon;
    }

    /**
     * set the Miles Per Gallon
     *
     * @param milesPerGallon
     */
    public void setMilesPerGallon(double milesPerGallon) {
        this.milesPerGallon = milesPerGallon;
    }

    /**
     * This uses the data from both milesDrivenPerYear and milesPerGallon to
     * come up with a Carbon Footprint for the car
     *
     * @return A number that represents the Carbon Footprint of this building
     */
    @Override
    public double getCarbonFootPrint() {
        System.out.println("Miles Per Gallon:" + this.milesPerGallon);
        System.out.println("Miles Driven Per Year:" + this.milesDrivenPerYear);
        return this.milesDrivenPerYear / this.milesPerGallon * 19.82;
    }

}
