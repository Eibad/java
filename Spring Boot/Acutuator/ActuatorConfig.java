package com.bgn.msuser.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.boot.actuate.info.MapInfoContributor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.*;

import java.util.*;

@Configuration
public class ActuatorConfig {

    @Autowired
    ConfigurableEnvironment configurableEnvironment;

    @Autowired
    Environment env;
    @Bean
    InfoContributor infoContributor() {
        Map<String, Object> map = new LinkedHashMap<>();
            for (PropertySource<?> propertySource : ((configurableEnvironment).getPropertySources())) {
                if (propertySource.getClass().getSimpleName().equals("OriginTrackedMapPropertySource"))
                    for (String key : ((EnumerablePropertySource) propertySource).getPropertyNames()) {
                        map.put(key, propertySource.getProperty(key));
                    }
            }

        Map<String, Object> wrapper = new HashMap<>();
        wrapper.put("application-properties", map);
        return new MapInfoContributor(wrapper);
    }
}
