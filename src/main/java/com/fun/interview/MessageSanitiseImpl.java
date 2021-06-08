package com.fun.interview;

public interface MessageSanitiseImpl {

    static final String REPLACE_STR = "REDACTED";

    String sanitiseMessage();

    String getMessage();
}
