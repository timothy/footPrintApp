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
public class Bicycle implements CarbonFootprint {

    private double milesTraveledPerMonth;

    /**
     * 
     * @param milesTraveledPerMonth 
     */
    public Bicycle(double milesTraveledPerMonth) {
        if (milesTraveledPerMonth >= 0) {
            this.milesTraveledPerMonth = milesTraveledPerMonth;
        } else {
            throw new InvalidFootprintException();
        }
    }

    /**
     * 
     * @return 
     */
    public double getMilesTraveledPerMonth() {
        return milesTraveledPerMonth;
    }

    /**
     * 
     * @param milesTraveledPerMonth 
     */
    public void setMilesTraveledPerMonth(double milesTraveledPerMonth) {
        this.milesTraveledPerMonth = milesTraveledPerMonth;
    }

    /**
     * 
     * @return 
     */
    @Override
    public double getCarbonFootPrint() {
        System.out.println("Miles Traveled Per Month:" + this.milesTraveledPerMonth);
        return this.milesTraveledPerMonth * .9;
    }
}
