package com.yyt.springcloud.service;

import com.yyt.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @description:
 * @author: YYT
 * @time: 2022/8/22
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
