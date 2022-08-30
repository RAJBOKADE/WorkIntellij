package com.crossasyst.java;

// Install the Java helper library from twilio.com/docs/java/install
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class TwilioSms {
    // Find your Account SID and Auth Token at twilio.com/console
    // and set the environment variables. See http://twil.io/secure
    public static final String ACCOUNT_SID = System.getenv("TWILIO_ACCOUNT_SID");
    public static final String AUTH_TOKEN = System.getenv("TWILIO_AUTH_TOKEN");

    public static void main(String[] args) {
        Twilio.init("AC65ee1dd03e5a905a6c47901d1cfa9b9c", "df6fedc7bb3719b3e9cd876b3f8fd062");
        Message message = Message.creator(
                        new com.twilio.type.PhoneNumber("+919833485172"),
                        new com.twilio.type.PhoneNumber("+17657536402"),
                        "Hi there twilio code").create();

        System.out.println("Sended Succesfully");
    }
}