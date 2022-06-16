package com.zl.springframeworkexplore.bean;

import org.springframework.context.annotation.Bean;

public interface InterfaceBean {
    @Bean
    default BeanDd BeanDd(){return new BeanDd();}
}
