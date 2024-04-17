package org.example;

public class SpanishMessage implements MessageService{
    private String greeting;
    @Override
    public String getMessage(){
        return greeting + ", Amigo!";
    }
}
