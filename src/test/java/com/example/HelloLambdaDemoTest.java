package com.example;

//JUnit 5
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

public class HelloLambdaDemoTest {

    @Test
    public void testHelloPrintOut() {
        HelloLambdaDemo lambda= new HelloLambdaDemo();

        Map<String, Object> mockInput = new HashMap<>();
        String result = lambda.handleRequest(mockInput, null);

        assertEquals("Hello from Java Lambda!",result);
    }
}