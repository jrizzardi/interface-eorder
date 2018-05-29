package edesur.eorder.creacion;

import edesur.eorder.Config;
import edesur.eorder.util.LoggingUtil;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;

public class CorteMacRequestProcessor implements Processor {
    private static final Logger logger = LoggingUtil.getLogger();

    @Override
    public void process(Exchange exchange) throws Exception {
        LoggingUtil.setMDC(Config.MDC);

        Object o = exchange.getIn().getBody();
        logger.warn("Body Type: {}", o.getClass().getSimpleName());
        logger.warn("Body: {}", o);
    }
}
