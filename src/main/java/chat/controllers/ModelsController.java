package chat.controllers;

import chat.models.response.models.Models;

public class ModelsController extends BaseController {

    public Models getAvailableModels() {
        return requestSpecification.get("models").getBody().as(Models.class);
    }
}
