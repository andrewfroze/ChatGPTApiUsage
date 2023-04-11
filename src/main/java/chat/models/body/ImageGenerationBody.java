package chat.models.body;

import lombok.Builder;

@Builder
public class ImageGenerationBody {

    private String prompt;
    private int n;
    private String size;
}
