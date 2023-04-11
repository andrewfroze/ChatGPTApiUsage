package chat.cash;

import chat.controllers.ModelsController;
import chat.models.response.models.Models;
import lombok.Getter;

@Getter
public class CashedResponses {

    @Getter
    private static final Models availableModels = new ModelsController().getAvailableModels();
}
