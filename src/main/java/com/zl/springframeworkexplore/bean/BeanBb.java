package com.zl.springframeworkexplore.bean;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class BeanBb {
    @Resource
    private BeanCc beanCc;
}
