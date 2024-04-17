package org.example;

public class EnglishMessage implements MessageService{
    private String greeting;
    @Override
    public String getMessage(){
        return greeting + ", World";
    }
}
