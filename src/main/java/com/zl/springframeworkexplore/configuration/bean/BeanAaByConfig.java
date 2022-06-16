package com.zl.springframeworkexplore.configuration.bean;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

public class BeanAaByConfig {

    @Resource
    private BeanBbByConfig beanBbByConfig;

    @PostConstruct
    public void a(){
        System.out.println(beanBbByConfig.getClass().getSimpleName());
    }
}
