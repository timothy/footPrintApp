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

    /**
     * 
     * @param monthlyElectricBill
     * @param monthlyGasBill 
     */
    public Building(double monthlyElectricBill, double monthlyGasBill) {
        if (monthlyElectricBill >= 0 && monthlyGasBill >= 0) {
            this.monthlyElectricBill = monthlyElectricBill;
            this.monthlyGasBill = monthlyGasBill;
        } else {
            throw new InvalidFootprintException();
        }
    }

   /**
    * 
    * @return 
    */
    public double getMonthlyElectricBill() {
        return monthlyElectricBill;
    }

    /**
     * 
     * @param monthlyElectricBill 
     */
    public void setMonthlyElectricBill(double monthlyElectricBill) {
        this.monthlyElectricBill = monthlyElectricBill;
    }

    /**
     * 
     * @return 
     */
    public double getMonthlyGasBill() {
        return monthlyGasBill;
    }

    /**
     * 
     * @param monthlyGasBill 
     */
    public void setMonthlyGasBill(double monthlyGasBill) {
        this.monthlyGasBill = monthlyGasBill;
    }

    /**
     * 
     * @return 
     */
    @Override
    public double getCarbonFootPrint() {
        System.out.println("Monthly Electric Bill:" + this.monthlyElectricBill);
        System.out.println("Monthly Gas Bill:" + this.monthlyGasBill);
        return ((this.monthlyGasBill / 10.68) * 119.58 * 12) + (this.monthlyElectricBill / 0.1188) * 1232 * 12;
    }
}
