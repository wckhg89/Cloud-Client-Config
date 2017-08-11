package ccc.ccc.controller;


import ccc.ccc.service.ConfigServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/configs")
public class ConfigServerController {


    private ConfigServerService configServerDynamicService;
    private ConfigServerService configServerStaticService;

    @Autowired
    public ConfigServerController
            (@Qualifier("configServerDynamicService")
             ConfigServerService configServerDynamicService,
             @Qualifier("configServerStaticService")
             ConfigServerService configServerStaticService) {
        this.configServerDynamicService = configServerDynamicService;
        this.configServerStaticService = configServerStaticService;
    }

    @GetMapping("/profiles/dynamic")
    public Map<String, String> getDynamicProfile () {
        return configServerDynamicService.getProfile();
    }


    @GetMapping("/profiles/static")
    public Map<String, String> getStaticProfile () {
        return configServerStaticService.getProfile();
    }

}
