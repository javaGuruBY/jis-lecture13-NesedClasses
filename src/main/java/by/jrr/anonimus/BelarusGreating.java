package by.jrr.anonimus;

import by.jrr.App;

import static by.jrr.App.log;

public class BelarusGreating implements HelloWorld {
    @Override
    public void greet() {
        log.info("Long live Belarus!");
    }

    @Override
    public void greetSomeone(String someone) {
        log.info("Hello, sjabra {}", someone);
    }
}
