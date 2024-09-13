package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.TextParsingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class GreetingServiceTest {

    @Autowired
    GreetingService greetingService;
    @Test
    void getGreeting() {
       String expectedMessage = "Preguntaste si lo que estas haciendo hoy te acerca al lugar en el que quieres estas mañana?";
        assertEquals(expectedMessage,greetingService.getGreeting());
    }

    @Test
    void GetNameInGreeting(){
        String name = "Adriel";
        String expexpectedMessage = "Adriel Preguntaste si lo que estas haciendo hoy te acerca al lugar en el que quieres estas mañana?";
        assertEquals(expexpectedMessage,greetingService.getNameInGreeting(name));
    }


}