package com.example.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BService {

    @Autowired
    Bean bean;
    @Autowired
    Bean2 bean2;
    @Autowired
    Bean3 bean3;

    public void out() {
        System.out.println("bean：" + bean.toString());
        System.out.println("bean2：" + bean2.toString());
        System.out.println("bean3：" + bean3.toString());
        bean.index += 1;
        bean3.index += 1;
        System.out.println("BService  bean：" + bean.index + " | bean3：" + bean3.index);
    }
}
