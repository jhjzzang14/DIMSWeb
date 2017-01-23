package com.javaholic.dims.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogManager {
	static Logger logger = LoggerFactory.getLogger(LogManager.class);
	
	/**
	 * Info Level Log
	 * @param logMessge
	 */
	public static void logInfo(String logMessge, Object...args){
		logger.info(logMessge, args);
	}
	
	/**
	 * Debug Level Log
	 */
	public static void logDebug(String logMessge, Object...args){
		logger.debug(logMessge , args);
	}
	
}
