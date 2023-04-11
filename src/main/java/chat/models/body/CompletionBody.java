package chat.models.body;


import com.google.gson.annotations.SerializedName;
import lombok.Builder;

@Builder
public class CompletionBody {

    private String prompt;
    @SerializedName("max_tokens")
    private int maxTokens;
    private int n;
    private String model;
    private double temperature;
}
