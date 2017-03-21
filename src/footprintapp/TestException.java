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
public class TestException extends IllegalArgumentException {

    public TestException() {
        super("You have entered an illegal argument dude!!\nWhat where you thinking???");
    }

    public TestException(String msg) {
        super(msg);
    }

    public TestException(String msg, Throwable exception) {
        super(msg, exception);
    }

    public TestException(Throwable exception) {
        super(exception);
    }
}
