package chat.models.response.completions;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class Usage {

    @SerializedName("prompt_tokens")
    private int promptTokens;
    @SerializedName("completion_tokens")
    private int completionTokens;
    @SerializedName("total_tokens")
    private int totalTokens;
}
