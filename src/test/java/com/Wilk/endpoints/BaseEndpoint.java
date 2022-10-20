package com.Wilk.endpoints;


import org.springframework.stereotype.Component;

@Component
public class BaseEndpoint {
    final String baseEndPoint = "https://jsonplaceholder.typicode.com/";

    public String getBaseEndPoint() {
        return baseEndPoint;
    }

}
