package ru.steklopod.rabbitmqexample;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PracticalTipMessageSimplified {

    private final String text;

    public PracticalTipMessageSimplified(@JsonProperty("text") final String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "PracticalTipMessageSimplified{" +
                "text='" + text + '\'' +
                '}';
    }
}
