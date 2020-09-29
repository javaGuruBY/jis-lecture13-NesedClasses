package by.jrr.anonimus;

import org.junit.Test;

public class AnnonymousTest {

    @Test
    public void regularClass() {
        BelarusGreating belarusGreating = new BelarusGreating();
        belarusGreating.greet();
        belarusGreating.greetSomeone("Vital");
    }

    @Test
    public void annonymousClass() {
        Annonymous annonymous = new Annonymous();
        annonymous.sayHelloToCounsuls();
    }
}
