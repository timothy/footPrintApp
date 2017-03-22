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
public class Building implements CarbonFootprint {

    private double monthlyElectricBill;
    private double monthlyGasBill;

    public Building(double monthlyElectricBill, double monthlyGasBill) {
        this.monthlyElectricBill = monthlyElectricBill;
        this.monthlyGasBill = monthlyGasBill;
    }

    public double getMonthlyElectricBill() {
        return monthlyElectricBill;
    }

    public void setMonthlyElectricBill(double monthlyElectricBill) {
        this.monthlyElectricBill = monthlyElectricBill;
    }

    public double getMonthlyGasBill() {
        return monthlyGasBill;
    }

    public void setMonthlyGasBill(double monthlyGasBill) {
        this.monthlyGasBill = monthlyGasBill;
    }

    // Building footprint = ([monthly gas bill / 10.68] * 119.58 * 12) + ([monthly electric bill / 0.1188] * 1232 * 12)
    @Override
    public double getCarbonFootPrint() {
        System.out.println("Monthly Electric Bill:" + this.monthlyElectricBill);
        System.out.println("Monthly Gas Bill:" + this.monthlyGasBill);
        return ((this.monthlyGasBill / 10.68) * 119.58 * 12) + (this.monthlyElectricBill / 0.1188) * 1232 * 12;
    }

}
