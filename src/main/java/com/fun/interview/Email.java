package com.fun.interview;

public class Email implements MessageSanitiseImpl {

    public static final String EMAIL_REGEX = "[a-zA-Z0-9\\.]+@[a-zA-Z0-9\\.]+\\.com";

    private final String message;

    public Email(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return sanitiseMessage();
    }

    @Override
    public String sanitiseMessage() {
        return message.replaceAll(EMAIL_REGEX, REPLACE_STR);
    }
}
