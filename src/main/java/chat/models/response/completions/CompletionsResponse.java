package chat.models.response.completions;

import lombok.Getter;

import java.util.ArrayList;

@Getter
public class CompletionsResponse {

    private String id;
    private String object;
    private int created;
    private String model;
    private ArrayList<Choice> choices;
    private Usage usage;
}
