package com.trs.soapdemo.service;

import com.trs.soapdemo.service.impl.GreetWebServiceImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.xml.ws.Endpoint;

/**
 * @Title MyListener
 * @Description:
 * @Create Date: 2020/7/28 14:04
 * @Author Zhenjin.Zhang
 * @Contact: zhang.zhenjin@trs.com.cn
 * @Company: 成都拓尔思信息技术有限公司
 * @Department: 中台（Middle-End）
 */
@Component
public class MyListener implements ApplicationRunner {

    @Value("${webservice.path}")
    private String path;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("发布地址:"+path);
        Endpoint.publish(path, new GreetWebServiceImpl());
        System.out.println("发布成功");
    }
}