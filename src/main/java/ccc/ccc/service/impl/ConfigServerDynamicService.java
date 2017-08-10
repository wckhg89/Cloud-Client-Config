package ccc.ccc.service.impl;

import ccc.ccc.service.ConfigServerService;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RefreshScope
public class ConfigServerDynamicService implements ConfigServerService {

    @Value("${guppy.said.first}")
    private String first;

    @Value("${guppy.said.second}")
    private String second;

    public Map<String, String> getProfile() {
        Map<String, String> propertiesMap
                = Maps.newHashMap(
                    ImmutableMap.<String, String>builder().
                            put("first", first).
                            put("second", second).
                            build()
                );


        return propertiesMap;
    }
}
