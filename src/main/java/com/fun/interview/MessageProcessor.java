package com.fun.interview;

import java.util.regex.Pattern;

public class MessageProcessor {

    public String processMessages(String message) {
        if(Pattern.compile(Phone.PHONE_REGEX).matcher(message).find()) {
          return new Phone(message).getMessage();
        }
        if(Pattern.compile(Email.EMAIL_REGEX).matcher(message).find()) {
            return new Email(message).getMessage();
        }
        return new Product().getMessage();
    }

}
