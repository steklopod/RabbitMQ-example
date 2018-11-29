package ru.steklopod.rabbitmqexample;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@JsonAutoDetect
@AllArgsConstructor
public class PracticalTipMessage {
    private final String text;
    private final int priority;
    private final boolean secret;

}
