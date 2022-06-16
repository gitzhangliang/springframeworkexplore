package com.zl.springframeworkexplore.configuration;

import com.zl.springframeworkexplore.configuration.bean.BeanBbByConfig;
import org.springframework.context.annotation.Bean;


public class ConfigurationBb {
    @Bean
    public BeanBbByConfig beanBbByConfig(){
        return new BeanBbByConfig();
    }
}
