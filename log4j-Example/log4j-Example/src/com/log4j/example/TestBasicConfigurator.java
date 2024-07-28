/*
 * Creation : 22 Dec 2022
 */
package com.log4j.example;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class TestBasicConfigurator {

    static Logger logger = Logger.getLogger(TestBasicConfigurator.class);

    public static void main(String[] args) {

        BasicConfigurator.configure();

        logger.error("ERROR MESSAGE!!");
        logger.info("INFO MESSAGE!!!");
        logger.debug("DEBUG MESSAGE!!!");
        logger.fatal("FATAL MESSAGE!!!");

    }

}
