package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {
    @Autowired
    @Qualifier("englishMessageService")
    private MessageService englishMessageService;

    @Autowired
    @Qualifier("spanishMessageService")
    private MessageService spanishMessageService;

    public void displayMessages(){
        System.out.println("English Message: " + englishMessageService.getMessage());
        System.out.println("Spanish Message: " + spanishMessageService.getMessage());
    }


}
