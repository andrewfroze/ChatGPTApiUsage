package chat.controllers;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.specification.RequestSpecification;

import static chat.config.ConfigLoader.API_CONFIG;

public class BaseController {
    protected RequestSpecification requestSpecification =
            RestAssured.given()
                    .baseUri(API_CONFIG.baseUrl())
                    .header("Content-Type", "application/json")
                    .header("Authorization", "Bearer " + API_CONFIG.apiKey());
}
