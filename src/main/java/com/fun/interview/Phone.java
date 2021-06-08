package com.fun.interview;

public class Phone implements MessageSanitiseImpl {

    public static final String PHONE_REGEX = "[0-9]{11}";

    private final String message;

    public Phone(String message) {
        this.message = message;
    }

    public String getMessage() {
        return sanitiseMessage();
    }

    @Override
    public String sanitiseMessage() {
        return message.replaceAll(PHONE_REGEX, REPLACE_STR);
    }
}
