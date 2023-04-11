package chat;


import chat.cash.CashedResponses;
import chat.controllers.CompletionsController;
import chat.controllers.ImageGenerationController;
import chat.models.response.completions.CompletionsResponse;
import chat.models.response.image.Image;

import static chat.enums.Model.DAVINCI;
import static chat.enums.ModelType.TEXT;

public class ChatGPTAPI {

    public static void main(String[] args) {
        CompletionsController completionsController = new CompletionsController();
        CompletionsResponse response = completionsController.askQuestion(
                "What is the meaning of life?", 50,
                CashedResponses.getAvailableModels().getModelsByType(TEXT, DAVINCI).get(1).getId(),
                0.0);

        System.out.println(response.getChoices().get(0).getText());

        ImageGenerationController imageGenerationController = new ImageGenerationController();
        Image image = imageGenerationController.generateImage("rabbit lost his carrot", "1024x1024", 1);
    }
}
