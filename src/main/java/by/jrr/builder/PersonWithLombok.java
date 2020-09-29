package by.jrr.builder;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PersonWithLombok {

    private String name;
    private String age;
    private String login;

}
