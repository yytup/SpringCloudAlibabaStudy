package com.yyt.springcloud.controller;

import com.yyt.springcloud.entities.CommonResult;
import com.yyt.springcloud.entities.Payment;
import com.yyt.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * @description:
 * @author: YYT
 * @time: 2022/8/22
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;
    @PostMapping(value = "/payment/create")
    public CommonResult create(Payment payment){
        int result = paymentService.create(payment);
        log.info("****插入结果"+result);
        if (result > 0){
            return new CommonResult(200,"插入数据成功",result);
        }else {
            return  new CommonResult(444,"插入数据失败",null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        System.out.println("测试提交代码是否成功！");
        if(payment != null)
        {
            return new CommonResult(200,"查询成功,serverPort:  ",payment);
        }else{
            return new CommonResult(444,"没有对应记录,查询ID: "+id,null);
        }

    }
}
