/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footprintapp;

/**
 * All classes that implement this must return a carbon footprint
 *
 * @author Timothy Bradford
 */
public interface CarbonFootprint {

    /**
     *
     * @return the carbon footprint of the object type
     */
    public double getCarbonFootPrint();
}
