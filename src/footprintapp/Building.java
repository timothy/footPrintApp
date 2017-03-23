/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footprintapp;

/**
 * The Building class stores monthly electric and gas bills and uses them to
 * generate a carbon footprint.
 *
 * @author Timothy Bradford
 */
public class Building implements CarbonFootprint {

    private double monthlyElectricBill;
    private double monthlyGasBill;

    /**
     *
     * @param monthlyElectricBill
     * @param monthlyGasBill
     * @throws InvalidFootprintException
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
     * Gets the Monthly Electric Bill
     *
     * @return monthlyElectricBill
     */
    public double getMonthlyElectricBill() {
        return monthlyElectricBill;
    }

    /**
     * sets Monthly Electric Bill
     *
     * @param monthlyElectricBill
     */
    public void setMonthlyElectricBill(double monthlyElectricBill) {
        this.monthlyElectricBill = monthlyElectricBill;
    }

    /**
     * gets Monthly Gas Bill
     *
     * @return
     */
    public double getMonthlyGasBill() {
        return monthlyGasBill;
    }

    /**
     * sets Monthly Gas Bill
     *
     * @param monthlyGasBill
     */
    public void setMonthlyGasBill(double monthlyGasBill) {
        this.monthlyGasBill = monthlyGasBill;
    }

    /**
     * This uses the data from both monthly electric and gas bills to come up
     * with a Carbon Footprint for the building
     *
     * @return A number that represents the Carbon Footprint of this building
     */
    @Override
    public double getCarbonFootPrint() {
        System.out.println("Monthly Electric Bill:" + this.monthlyElectricBill);
        System.out.println("Monthly Gas Bill:" + this.monthlyGasBill);
        return ((this.monthlyGasBill / 10.68) * 119.58 * 12) + (this.monthlyElectricBill / 0.1188) * 1232 * 12;
    }
}
