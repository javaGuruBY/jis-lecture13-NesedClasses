package by.jrr.builder;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonWithLombokTest {

    @Test
    public void classWithLombok() {
        PersonWithLombok person = PersonWithLombok.builder().age("as").login("login").build();
        person.setAge("34");
        person.getName();

        System.out.println(person);

    }

}
