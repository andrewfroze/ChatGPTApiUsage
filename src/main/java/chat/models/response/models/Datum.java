package chat.models.response.models;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

import java.util.ArrayList;

@Getter
public class Datum {
    private String id;
    private String object;
    private int created;
    @SerializedName("owned_by")
    private String ownedBy;
    private ArrayList<Permission> permission;
    private String root;
    private Object parent;
}
