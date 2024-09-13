package org.example;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@ConfigurationProperties(prefix = "greetings")
public class GretingProperties {
    public Map<String, String> greetings;
    public Map<String, String> getGetGreeting(){
        return greetings;
    }
    public void setGreetings(Map<String, String> greetings)
    {
        this.greetings= greetings;
    }
}
