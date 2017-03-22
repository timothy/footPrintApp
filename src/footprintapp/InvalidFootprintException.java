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
class InvalidFootprintException extends IllegalArgumentException {

    /**
     * 
     */
    public InvalidFootprintException() {
        super("Invalid footprint was detected.");
    }

    /**
     * 
     * @param msg 
     */
    public InvalidFootprintException(String msg) {
        super(msg);
    }

    /**
     * 
     * @param msg
     * @param exception 
     */
    public InvalidFootprintException(String msg, Throwable exception) {
        super(msg, exception);
    }

    /**
     * 
     * @param exception 
     */
    public InvalidFootprintException(Throwable exception) {
        super(exception);
    }
}
