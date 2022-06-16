package com.zl.springframeworkexplore.configuration;

import com.zl.springframeworkexplore.configuration.bean.BeanAaByConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(ConfigurationBb.class)
public class ConfigurationAa {
    @Bean
    public BeanAaByConfig beanAaByConfig(){
        return new BeanAaByConfig();
    }
}
