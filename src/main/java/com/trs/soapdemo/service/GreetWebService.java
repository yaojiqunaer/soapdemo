package com.trs.soapdemo.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * @Title GreetWebService
 * @Description:
 * @Create Date: 2020/7/28 14:01
 * @Author Zhenjin.Zhang
 * @Contact: zhang.zhenjin@trs.com.cn
 * @Company: 成都拓尔思信息技术有限公司
 * @Department: 中台（Middle-End）
 */
@WebService
public interface GreetWebService {

    @WebMethod
    String greeting(@WebParam String hello);
}
