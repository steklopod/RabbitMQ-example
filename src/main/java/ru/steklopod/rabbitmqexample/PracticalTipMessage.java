package ru.steklopod.rabbitmqexample;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PracticalTipMessage {

    private final String text;
    private final int priority;
    private final boolean secret;

    public PracticalTipMessage(@JsonProperty("text") final String text,
                               @JsonProperty("priority") final int priority,
                               @JsonProperty("secret") final boolean secret) {
        this.text = text;
        this.priority = priority;
        this.secret = secret;
    }
}
