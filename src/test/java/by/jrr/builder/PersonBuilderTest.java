package by.jrr.builder;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonBuilderTest {

    @Test
    public void personBuilderUsage() {
        PersonBuilder personBuilder = new PersonBuilder();
        Person person = personBuilder.setAge("23").setLogin("vasya").setName("max").build();
    }

}
