package spring.in.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * Created by shliangyan on 2017/9/15.
 */
@Configuration
@PropertySource("/app.properties")// 声明属性源
public class ExpressiveConfig {

    @Autowired
    Environment env;

    @Bean
    public String[] disc() {
        return new String[]{env.getProperty("disc.title", "unknown"), env.getProperty("disc.artist", "unknown")};
    }
}
