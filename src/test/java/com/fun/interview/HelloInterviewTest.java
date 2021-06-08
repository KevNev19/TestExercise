package com.fun.interview;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Email sanitization
 *
 * Remove email address, phone number or anything private from message
 *
 * Replace with work REDACTED
 */
class HelloInterviewTest {

    private MessageProcessor msgProcessor;

    @ParameterizedTest(name = "[{index}] getMessage({0})={1}")
    @CsvSource(delimiter = ':',
    value = {
            "I have details kevin.addison@tesco.com:I have details REDACTED",
            "I have details kevin.addison@tesco.com and dave.1234twig@tesco.com:I have details REDACTED and REDACTED",
            "I have details 07752090622:I have details REDACTED"
    })
    public void givenAMessage_ReturnSanitisedString(String input, String expected) {
        msgProcessor = new MessageProcessor();
        assertEquals(msgProcessor.processMessages(input), expected);
    }

    @Test
    public void givenAMessageWithAProduct_SanitiseAllProductInformation() {

    }

}