package ru.steklopod.rabbitmqexample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class PracticalTipListener {

    private static final Logger log = LoggerFactory.getLogger(PracticalTipListener.class);

    @RabbitListener(queues = RabbitmqExampleApplication.DEFAULT_PARSING_QUEUE)
    public void consumeDefaultMessage(final Message message) {
        log.info("Received message, tip is: {}", message.toString());
    }
}
