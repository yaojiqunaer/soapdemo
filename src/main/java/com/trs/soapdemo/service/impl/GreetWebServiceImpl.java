package com.trs.soapdemo.service.impl;

import com.trs.soapdemo.service.GreetWebService;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * @Title GreetWebServiceImpl
 * @Description:
 * @Create Date: 2020/7/28 14:02
 * @Author Zhenjin.Zhang
 * @Contact: zhang.zhenjin@trs.com.cn
 * @Company: 成都拓尔思信息技术有限公司
 * @Department: 中台（Middle-End）
 */
@WebService
public class GreetWebServiceImpl implements GreetWebService {


    @WebMethod
    @Override
    public String greeting(@WebParam String hello) {
        System.out.println(hello);
        return "Good Morning:" + hello;
    }
}
