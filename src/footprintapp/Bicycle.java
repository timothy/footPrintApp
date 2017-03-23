/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footprintapp;

/**
 * The Bicycle class stores miles Traveled Per Month and uses it to generate a
 * carbon footprint.
 *
 * @author Timothy Bradford
 */
public class Bicycle implements CarbonFootprint {

    private double milesTraveledPerMonth;

    /**
     *
     * @param milesTraveledPerMonth
     * @throws InvalidFootprintException
     */
    public Bicycle(double milesTraveledPerMonth) {
        if (milesTraveledPerMonth >= 0) {
            this.milesTraveledPerMonth = milesTraveledPerMonth;
        } else {
            throw new InvalidFootprintException();
        }
    }

    /**
     * get the Miles Traveled Per Month
     *
     * @return this.milesTraveledPerMonth
     */
    public double getMilesTraveledPerMonth() {
        return this.milesTraveledPerMonth;
    }

    /**
     * set the Miles Traveled Per Month
     *
     * @param milesTraveledPerMonth
     */
    public void setMilesTraveledPerMonth(double milesTraveledPerMonth) {
        this.milesTraveledPerMonth = milesTraveledPerMonth;
    }

    /**
     * This uses the data from milesTraveledPerMonth come up with a Carbon
     * Footprint for the Bicycle
     *
     * @return
     */
    @Override
    public double getCarbonFootPrint() {
        System.out.println("Miles Traveled Per Month:" + this.milesTraveledPerMonth);
        return this.milesTraveledPerMonth * .9;
    }
}
