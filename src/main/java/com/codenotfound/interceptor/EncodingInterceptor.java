package com.codenotfound.interceptor;

import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.charset.StandardCharsets;

public class EncodingInterceptor extends AbstractPhaseInterceptor<Message> {
    private static final Logger log = LoggerFactory.getLogger(EncodingInterceptor.class);

    public EncodingInterceptor() {
        super(Phase.PRE_STREAM);
        log.debug("EncodingInterceptor constructor called ");
    }

    @Override
    public void handleMessage(Message message) throws Fault {
        String encoding = (String) message.get(Message.ENCODING);
        log.info("Encoding is {}", encoding);

        // set to UTF-8
        message.put(Message.ENCODING, StandardCharsets.UTF_8.toString());
    }
}
