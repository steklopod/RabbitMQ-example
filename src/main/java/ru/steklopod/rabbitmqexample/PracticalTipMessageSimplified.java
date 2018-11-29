package ru.steklopod.rabbitmqexample;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@JsonAutoDetect
@AllArgsConstructor
public class PracticalTipMessageSimplified {
    private final String text;
}


