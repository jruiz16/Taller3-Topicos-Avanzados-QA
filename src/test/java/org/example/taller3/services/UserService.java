package org.example.taller3.services;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.example.taller3.models.User;

public class UserService {
    private final String baseUri = "https://demoqa.com";
    private final String createUserEndpoint = "/Account/v1/User";

    public Response createUser(User user) {
        return RestAssured.given()
                .contentType("application/json")
                .body(user)
                .post(baseUri + createUserEndpoint);
    }
}

