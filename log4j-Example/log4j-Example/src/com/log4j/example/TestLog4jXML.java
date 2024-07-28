/*
 * Creation : 22 Dec 2022
 */
package com.log4j.example;

import org.apache.log4j.Logger;

public class TestLog4jXML {

    static Logger logger = Logger.getLogger(TestLog4jXML.class);

    public static void main(String[] args) {

        logger.error(" ERROR Log Message!!! ");
        logger.info(" INFO Log Message!!! ");
        logger.debug(" DEBUG Log Message!!! ");
        logger.fatal(" FATAL Log Message!!! ");
    }
}