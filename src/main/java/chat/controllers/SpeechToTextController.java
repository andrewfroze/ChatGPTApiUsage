package chat.controllers;

import chat.models.response.speechtotext.SpeechToTextResponse;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.io.File;

public class SpeechToTextController extends BaseController {

    public SpeechToTextResponse convertSpeechToText(String pathToFile) {
        return requestSpecification
                .contentType(ContentType.MULTIPART)
                .multiPart(new File(pathToFile))
                .formParam("model", "whisper-1")
                .post("audio/transcriptions")
                .getBody().as(SpeechToTextResponse.class);
    }
}
