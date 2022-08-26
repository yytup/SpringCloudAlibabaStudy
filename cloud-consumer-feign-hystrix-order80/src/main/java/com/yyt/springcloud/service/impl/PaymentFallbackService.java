package com.yyt.springcloud.service.impl;

import com.yyt.springcloud.service.PaymentHystrixService;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: YYT
 * @time: 2022/8/26
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {

    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK ,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut ,o(╥﹏╥)o";
    }
}
