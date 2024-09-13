package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    Environment enviroment;

    @Value("${greeting.message}")
    String greet;

    public String getGreeting() {
        return greet;
    }
    public String getNameInGreeting(String name){
        return name + " " + greet;
    }

}
