package com.baobao.service;

import com.baobao.config.AppConfig;
import com.baobao.dao.AccountMapper;
import com.baobao.po.AccountBookPO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Method;

public class CityService {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        AccountBookPO po = configApplicationContext.getBean(AccountMapper.class).getAccount(7);
        System.out.println();

        Method method = CityService.class.getMethod("s");
        method.getReturnType()
    }

//    AccountMapper dao;
//    public void query(){
//        System.out.println(dao.query);
//    }


    //BeanFactory factory = new XmlBeanFactory(new ClassPathResource("spring-config.xml"));
    //factory.getBean("beanId");

}
