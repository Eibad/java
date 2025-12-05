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
dsfsdfsdf
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

//        Map<String, Object> map = new HashMap();
//        for(Iterator it = configurableEnvironment.getPropertySources().iterator(); it.hasNext(); ) {
//            PropertySource propertySource = (PropertySource) it.next();
//            if (propertySource instanceof MapPropertySource) {
//                map.putAll(((MapPropertySource) propertySource).getSource());
//            }
//        }


//        Properties properties =  configurableEnvironment.getPropertySources().iterator();

//        details.put("server.port", configurableEnvironment.getProperty("server.port"));
//        details.put("spring.application.name", configurableEnvironment.getProperty("spring.application.name"));
//        details.put("server.servlet.context-path", configurableEnvironment.getProperty("server.servlet.context-path"));
//        details.put("spring.data.mongodb.database", configurableEnvironment.getProperty("spring.data.mongodb.database"));
//        details.put("spring.data.mongodb.port.", configurableEnvironment.getProperty("spring.data.mongodb.port"));
//        details.put("spring.data.mongodb.host", configurableEnvironment.getProperty("spring.data.mongodb.host"));
//        details.put("broker.url", configurableEnvironment.getProperty("broker.url"));
//        details.put("broker.username", configurableEnvironment.getProperty("broker.username"));
//        details.put("broker.password", configurableEnvironment.getProperty("broker.password"));
//        details.put("queue.email", configurableEnvironment.getProperty("queue.email"));
//        details.put("queue.sms", configurableEnvironment.getProperty("queue.sms"));
//        details.put("queue.push_notification", configurableEnvironment.getProperty("queue.push_notification"));
//        details.put("async.core.pool.size", configurableEnvironment.getProperty("async.core.pool.size"));
//        details.put("async.max.pool.size", configurableEnvironment.getProperty("async.max.pool.size"));
//        details.put("async.queue.capacity", configurableEnvironment.getProperty("async.queue.capacity"));
//        details.put("async.thread.name.prefix", configurableEnvironment.getProperty("async.thread.name.prefix"));
//        details.put("bgn.deal-service.feign.name", configurableEnvironment.getProperty("bgn.deal-service.feign.name"));
//        details.put("bgn.user-service.feign.name", configurableEnvironment.getProperty("bgn.user-service.feign.name"));

        Map<String, Object> wrapper = new HashMap<>();
        wrapper.put("application-properties", map);
        return new MapInfoContributor(wrapper);
    }
}
