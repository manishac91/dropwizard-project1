package eu.kielczewski.example.config;

import javax.validation.constraints.NotNull;

public class MessagesConfiguration {

    @NotNull
    private String hello;

    //commit1
    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }
}
