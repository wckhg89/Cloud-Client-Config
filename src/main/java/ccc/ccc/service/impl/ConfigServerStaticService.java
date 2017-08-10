package ccc.ccc.service.impl;

import ccc.ccc.service.ConfigServerService;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service
public class ConfigServerStaticService implements ConfigServerService {
    @Override
    public Map<String, String> getProfile() {
        return null;
    }
}
