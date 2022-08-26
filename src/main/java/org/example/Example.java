package org.example;

// Install the Java helper library from twilio.com/docs/java/install

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class Example {
    // Find your Account SID and Auth Token at twilio.com/console
    // and set the environment variables. See http://twil.io/secure
    public static final String ACCOUNT_SID = System.getenv("TWILIO_ACCOUNT_SID");
    public static final String AUTH_TOKEN = System.getenv("TWILIO_AUTH_TOKEN");

    public static void main(String[] args) {
        Twilio.init("ACc28ff66a464194ebbbbd761e047fad92", "873eb4c6cf6f7d2c08e03ff29ba8c618");
        Message message = Message.creator(
                        new com.twilio.type.PhoneNumber("+919594017113"),
                        new com.twilio.type.PhoneNumber("+19496948938"),
                        "Hi there")
                .create();

        System.out.println(message.getSid());
    }
}