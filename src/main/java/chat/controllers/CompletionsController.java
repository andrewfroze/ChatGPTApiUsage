package chat.controllers;

import chat.models.body.CompletionBody;
import chat.models.response.completions.CompletionsResponse;
import io.restassured.response.Response;
import org.json.JSONObject;

public class CompletionsController extends BaseController {

    public CompletionsResponse askQuestion(String message, int maxResponseLength, String modelId, Double temperature) {
        requestSpecification.body(CompletionBody.builder()
                .prompt(message)
                .maxTokens(maxResponseLength)
                .n(1)
                .model(modelId)
                .temperature(temperature)
                .build());
        Response response = requestSpecification.post("completions");
        response.prettyPrint();
        return response.getBody().as(CompletionsResponse.class);
    }
}
