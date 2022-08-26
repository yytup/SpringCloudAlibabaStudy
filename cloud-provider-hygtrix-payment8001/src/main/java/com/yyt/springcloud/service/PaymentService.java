package com.yyt.springcloud.service;

import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: YYT
 * @time: 2022/8/26
 */
@Service
public interface PaymentService {

    String paymentInfo_OK(Integer id);


    String paymentInfo_TimeOut(Integer id);

}
