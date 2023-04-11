package chat.controllers;

import chat.models.body.ImageGenerationBody;
import chat.models.response.image.Image;
import io.restassured.response.Response;

public class ImageGenerationController extends BaseController {

    public Image generateImage(String description, String size, int n) {
        requestSpecification.body(ImageGenerationBody.builder()
                .prompt(description)
                .n(n)
                .size(size));
        Response response = requestSpecification.post("images/generations");
        response.prettyPrint();
        return response.getBody().as(Image.class);
    }
}
