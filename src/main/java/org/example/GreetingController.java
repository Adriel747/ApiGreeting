package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class GreetingController {
    @Autowired
    GreetingService greetingService;

    @GetMapping
    public String greeting()
    {
        return greetingService.getGreeting();
    }

    @GetMapping("/personalized")
    public String nameInGreeting(@RequestParam String name){
        return greetingService.getNameInGreeting(name);
    }
}
