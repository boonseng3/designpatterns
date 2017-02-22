package com.obs.designpattern;

import com.obs.designpattern.domain.EmailMessage;
import com.obs.designpattern.domain.FaxMessage;
import com.obs.designpattern.domain.Message;
import com.obs.designpattern.handler.EmailHandler;
import com.obs.designpattern.handler.FaxHandler;
import com.obs.designpattern.handler.Handler;
import com.obs.designpattern.handler.HandlerChain;
import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * Created by ongbo on 2/22/2017.
 */
public class HandlerChainTest {
    @Test
    public void process() throws Exception {
        HandlerChain chain = new HandlerChain();
        Handler emailHandler = new EmailHandler();
        Handler faxHandler = new FaxHandler();

        chain.add(emailHandler).add(faxHandler);

        Message message1 = new EmailMessage("Hello", "abc@abc.com");
        Message message2 = new FaxMessage("World", "12312412");

        assertThat(chain.process(message1)).isTrue();
        assertThat(chain.process(message2)).isTrue();
        // unknown message
        assertThat(chain.process(new Message() {
            @Override
            public String getMessage() {
                return "unknown";
            }
        })).isFalse();

        assertThat(chain.process(message2)).isTrue();
        assertThat(chain.process(message1)).isTrue();
    }
}