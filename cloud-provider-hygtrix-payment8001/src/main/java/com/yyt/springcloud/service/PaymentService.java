package com.yyt.springcloud.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @description:
 * @author: YYT
 * @time: 2022/8/26
 */
@Service
public interface PaymentService {

    String paymentInfo_OK(Integer id);


    String paymentInfo_TimeOut(Integer id);

    String paymentCircuitBreaker(@PathVariable("id") Integer id);

    String paymentCircuitBreaker_fallback(@PathVariable("id") Integer id);

}
