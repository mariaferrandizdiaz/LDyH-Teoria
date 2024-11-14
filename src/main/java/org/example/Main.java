/**
 * Package example.
 */
package org.example;

import java.util.logging.Logger;
import java.util.logging.Level;


/**
 * Main class: Dice "Hello world!" como modo de prueba.
 */
public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        System.out.println("Hello world!");
        logger.log(Level.WARNING, "ups");
    }
}
