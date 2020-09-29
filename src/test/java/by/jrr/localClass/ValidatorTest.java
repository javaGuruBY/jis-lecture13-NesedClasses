package by.jrr.localClass;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidatorTest {

    @Test
    public void validator() {
        Validator.validatePhoneNumber("123-adf-355");
        Validator.validatePhoneNumber("123-343-355-9");
    }
}
