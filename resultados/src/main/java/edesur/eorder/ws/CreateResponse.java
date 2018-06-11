package edesur.eorder.ws;

import edesur.eorder.ws.common.schemas.Response;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateResponse implements Processor {
    private static final Logger logger = LoggerFactory.getLogger(CreateResponse.class);

    @Override
    public void process(Exchange exchange) throws Exception {
        Object o = exchange.getIn().getBody();
        logger.warn(o.getClass().getCanonicalName());

        Response response = new Response();
        response.setCodigo("OK");
        response.setDescripcion("Be Cool");
        exchange.getOut().setBody(response);
    }
}
