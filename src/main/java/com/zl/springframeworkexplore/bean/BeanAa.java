package com.zl.springframeworkexplore.bean;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BeanAa extends AbstractBean implements InterfaceBean {
    @Resource
    private BeanBb beanBb;

}
