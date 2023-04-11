package chat.models.response.models;

import chat.enums.Model;
import chat.enums.ModelType;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Getter
public class Models {
    private String object;
    private ArrayList<Datum> data;

    public Datum findModel(String modelId) {
        return data.stream()
                .filter(model -> model.getId().equals(modelId))
                .findFirst()
                .orElse(null);
    }

    public List<Datum> getModels(Model model) {
        return data.stream()
                .filter(m -> m.getId().contains(model.name().toLowerCase(Locale.ROOT)))
                .toList();
    }

    public List<Datum> getModelsByType(ModelType modelType, Model model) {
        return data.stream()
                .filter(m -> m.getId().contains(model.name().toLowerCase(Locale.ROOT))
                && m.getId().contains(modelType.name().toLowerCase(Locale.ROOT)))
                .toList();
    }

    public String getFirstModelId(Model model) {
        return getModels(model).stream().findFirst().map(Datum::getId).orElse(null);
    }
}
