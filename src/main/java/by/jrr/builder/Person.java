package by.jrr.builder;

public class Person {

    String name;
    String age;
    String login;

    private Person() {
    }

    public Person(String name, String age, String login) {
        this.name = name;
        this.age = age;
        this.login = login;
    }

    private Person(PersonBuilder personBuilder) {
        this.name = personBuilder.name;
        this.age = personBuilder.age;
        this.login = personBuilder.login;
    }

    public static PersonBuilder builder() {
        return new PersonBuilder();
    }

    public static class PersonBuilder {

        private String name;
        private String age;
        private String login;

        public PersonBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder setAge(String age) {
            this.age = age;
            return this;
        }

        public PersonBuilder setLogin(String login) {
            this.login = login;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

}
