/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footprintapp;

/**
 * Invalid Footprint Exception should be thrown any time an illegal argument is
 * added for a class the implements CarbonFootprint
 *
 * @author Timothy Bradford
 */
class InvalidFootprintException extends IllegalArgumentException {

    /**
     * default constructor
     */
    public InvalidFootprintException() {
        super("Invalid footprint was detected.");
    }

    /**
     *
     * @param msg a custom message to display when exception is thrown
     */
    public InvalidFootprintException(String msg) {
        super(msg);
    }

    /**
     *
     * @param msg a custom message to display when exception is thrown
     * @param exception a custom Throwable exception
     */
    public InvalidFootprintException(String msg, Throwable exception) {
        super(msg, exception);
    }

    /**
     *
     * @param exception a custom Throwable exception
     */
    public InvalidFootprintException(Throwable exception) {
        super(exception);
    }
}
