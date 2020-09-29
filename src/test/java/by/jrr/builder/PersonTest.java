package by.jrr.builder;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void setReturnsObject() {
//        Person person = new Person();

//        person.setAge("12")
//                .setName("Vasya")
//                .setLogin("login");

    }

    @Test
    public void builderSecondGen() {
        Person person = Person.builder()
                .setAge("34")
                .setLogin("logh")
                .setName("name")
                .build();
    }

}
