package com.yyt.springcloud.service.impl;

import com.yyt.springcloud.dao.PaymentDao;
import com.yyt.springcloud.entities.Payment;
import com.yyt.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @description:
 * @author: YYT
 * @time: 2022/8/22
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }
}
