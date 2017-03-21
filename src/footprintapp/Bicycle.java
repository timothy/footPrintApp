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
public class Bicycle {

    private double milesTraveledPerMonth;

    public Bicycle(double milesTraveledPerMonth) {
        this.milesTraveledPerMonth = milesTraveledPerMonth;
    }

    public double getMilesTraveledPerMonth() {
        return milesTraveledPerMonth;
    }

    public void setMilesTraveledPerMonth(double milesTraveledPerMonth) {
        this.milesTraveledPerMonth = milesTraveledPerMonth;
    }

}
