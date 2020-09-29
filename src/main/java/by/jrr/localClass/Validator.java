package by.jrr.localClass;

import by.jrr.App;
import lombok.Data;

public class Validator {

    static String regularExpression = "[^0-9]";

    public static void validatePhoneNumber(String number) {
        final int phoneLength = 10;

        @Data
        class PhoneNumber {
            String formattedPhoneNumber = null;

            public PhoneNumber(String phoneNumberAsString) {
                String currentNumber = phoneNumberAsString.replaceAll(regularExpression, "");

                if(currentNumber.length() == phoneLength) {
                    formattedPhoneNumber = currentNumber;
                } else  {
                    formattedPhoneNumber = null;
                }
            }
        }

        PhoneNumber validNumber = new PhoneNumber(number);
        if(validNumber.getFormattedPhoneNumber() == null) {
            App.log.info("number {} invalid", number);
        } else {
            App.log.info("{} is valid", number);
        }
    }
}
