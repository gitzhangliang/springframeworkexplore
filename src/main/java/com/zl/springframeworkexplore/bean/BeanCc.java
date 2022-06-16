package com.zl.springframeworkexplore.bean;

import com.starter.autoconfigure.HelloHandler;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

@Component
public class BeanCc implements InitializingBean {

    private static int i = 0;
    @Resource
    private BeanAa beanAa;
    @Resource
    private HelloHandler helloHandler;
    @Resource
    private BeanDd beanDd;

    @PostConstruct
    public void a() {
        System.out.print(++i);
        System.out.print("--");
        System.out.print("PostConstruct");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.print(++i);
        System.out.print("--");
        System.out.print("afterPropertiesSet");
    }
}
