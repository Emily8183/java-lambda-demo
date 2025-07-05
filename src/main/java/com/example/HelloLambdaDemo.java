package com.example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.Map;

public class HelloLambdaDemo implements RequestHandler<Map<String, Object>, String> { //takes two parameters: the input type and the output type

    @Override
    public String handleRequest(Map<String, Object> input, Context context) {
        return "Hello from Java Lambda!";
    }
}
