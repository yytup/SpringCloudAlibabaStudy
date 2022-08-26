package com.yyt.springcloud.service;

import com.yyt.springcloud.entities.CommonResult;
import com.yyt.springcloud.entities.Payment;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.concurrent.TimeUnit;

/**
 * @description:
 * @author: YYT
 * @time: 2022/8/26
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    // 延时三秒测试OpenFeign的超时控制
    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout();
}
