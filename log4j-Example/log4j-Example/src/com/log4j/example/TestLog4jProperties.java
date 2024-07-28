/*
 * Creation : 22 Dec 2022
 */
package com.log4j.example;

import org.apache.log4j.Logger;

public class TestLog4jProperties {
    static Logger logger = Logger.getLogger(TestLog4jProperties.class);

    public static void main(String[] args) {

        logger.error("ERROR MESSAGE!!");
        logger.info("INFO MESSAGE!!!");
        logger.debug("DEBUG MESSAGE!!!");
        logger.fatal("FATAL MESSAGE!!!");

    }

}