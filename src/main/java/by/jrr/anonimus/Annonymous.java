package by.jrr.anonimus;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import static by.jrr.App.log;

public class Annonymous {



    public void sayHelloToCounsuls() {
        final String name = "name";

        class EnglishGreeting implements HelloWorld {
            @Override
            public void greet() {
                log.info("God save the Queen!");
            }

            @Override
            public void greetSomeone(String someone) {
                log.info("Hello, friend {}", name);
            }
        }

        HelloWorld elnglishGreeting = new EnglishGreeting();

        HelloWorld ukraineGreeting = new HelloWorld() {

            public static final String login = "";
            @Override
            public void greet() {
                log.info("slava Ucraine!");
            }

            @Override
            public void greetSomeone(String someone) {
                log.info("Hello, druze {}", name);
            }
        };

        elnglishGreeting.greet();
        ukraineGreeting.greet();

        HelloWorld polandGreeting = new HelloWorld() {

            public static final String login = "";
            @Override
            public void greet() {
                log.info("slava Poland!");
            }

            @Override
            public void greetSomeone(String someone) {
                log.info("Hello, druze {}", name);
            }
        };

        log.info("elnglishGreeting {}", elnglishGreeting.getClass().getName());
        log.info("ukraineGreeting {}", ukraineGreeting.getClass().getName());
        log.info("polandGreeting {}", polandGreeting.getClass().getName());
    }

}
