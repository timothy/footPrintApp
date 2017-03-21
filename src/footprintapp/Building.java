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
public class Building {

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

}
