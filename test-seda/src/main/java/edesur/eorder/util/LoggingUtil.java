package edesur.eorder.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public final class LoggingUtil {
    private static final String KEY = "camel.contextId";

    public static Logger getLogger() {
        return LoggerFactory.getLogger(Thread.currentThread().getStackTrace()[2].getClassName());
    }

    public static void setMDC(String value) {
        MDC.put(KEY, value);
    }

    private LoggingUtil() {}
}