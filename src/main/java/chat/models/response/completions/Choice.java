package chat.models.response.completions;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class Choice {

    private String text;
    private int index;
    private Object logprobs;
    @SerializedName("finish_reason")
    private String finishReason;
}
