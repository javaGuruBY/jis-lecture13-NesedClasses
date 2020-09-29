package by.jrr.localClass;

import by.jrr.App;

import static by.jrr.App.log;

public class Greatings {

    public void sayHello () {
        class EnglishHello {
            public static final String GREATINGS = "Hello";
            public void say() {
                log.info("{}", GREATINGS);
            }
        }
        var englishHello = new EnglishHello();
        englishHello.say();
    }
}
