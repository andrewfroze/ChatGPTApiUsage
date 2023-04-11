package chat.models.response.models;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class Permission {
    private String id;
    private String object;
    private int created;
    @SerializedName("allow_create_engine")
    private boolean allowCreateEngine;
    @SerializedName("allow_sampling")
    private boolean allowSampling;
    @SerializedName("allow_logprobs")
    private boolean allowLogprobs;
    @SerializedName("allow_search_indices")
    private boolean allowSearchIndices;
    @SerializedName("allow_view")
    private boolean allowView;
    @SerializedName("allow_fine_tuning")
    private boolean allowFineTuning;
    private String organization;
    private Object group;
    @SerializedName("is_blocking")
    private boolean isBlocking;
}
