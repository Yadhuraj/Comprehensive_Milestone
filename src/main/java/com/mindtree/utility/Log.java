package com.mindtree.utility;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;

public class Log {
	// static Logger logger = Logger.getLogger(Log.class);
//	static {
//        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy-hh-mm-ss");
//        System.setProperty("currenttime", dateFormat.format(new Date()));
//    }
	public static void testLoggerDebug(Logger logger, String msg) {
		logger.debug(msg);
	}

	public static void testLoggerInfo(Logger logger, String msg) {
		logger.info(msg);
	}

	public static void testLoggerWarn(Logger logger, String msg) {
		logger.warn(msg);
	}

	public static void testLoggerError(Logger logger, String msg) {
		logger.error(msg);
	}

	public static void testLoggerFatal(Logger logger, String msg) {
		logger.fatal(msg);
	}
}
