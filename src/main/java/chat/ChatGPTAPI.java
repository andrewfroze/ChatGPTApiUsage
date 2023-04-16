package chat;


import chat.cash.CashedResponses;
import chat.controllers.CompletionsController;
import chat.controllers.ImageGenerationController;
import chat.controllers.SpeechToTextController;
import chat.models.response.completions.CompletionsResponse;
import chat.models.response.image.Image;
import chat.models.response.speechtotext.SpeechToTextResponse;
import io.restassured.response.Response;

import static chat.enums.Model.DAVINCI;
import static chat.enums.ModelType.TEXT;

public class ChatGPTAPI {

    public static void main(String[] args) {
        // text generation example
        CompletionsController completionsController = new CompletionsController();
        CompletionsResponse response = completionsController.askQuestion(
                "What is the meaning of life?", 50,
                CashedResponses.getAvailableModels().getModelsByType(TEXT, DAVINCI).get(1).getId(),
                0.0);

        System.out.println(response.getChoices().get(0).getText());

        // image generation example
        ImageGenerationController imageGenerationController = new ImageGenerationController();
        Image image = imageGenerationController.generateImage("rabbit lost his carrot", "1024x1024", 1);

        // speech to text example
        SpeechToTextController speechToTextController = new SpeechToTextController();
        SpeechToTextResponse response1 = speechToTextController.convertSpeechToText("path/to/file.mp3");
    }
}
