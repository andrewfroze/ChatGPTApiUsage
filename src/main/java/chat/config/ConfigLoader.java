package chat.config;

import org.aeonbits.owner.ConfigFactory;

public class ConfigLoader {

    public static final ApiConfig API_CONFIG = ConfigFactory.create(ApiConfig.class);
}
