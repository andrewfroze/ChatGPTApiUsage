package chat.config;

import jdk.jfr.Description;
import lombok.Builder;
import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources("classpath:api.properties")
public interface ApiConfig extends Config {

    @Config.Key("base.url")
    @Config.DefaultValue("https://api.openai.com/v1/")
    String baseUrl();

    @Description("Can be generated here: https://platform.openai.com/account/api-keys")
    @Config.Key("api.key")
    String apiKey();
}
