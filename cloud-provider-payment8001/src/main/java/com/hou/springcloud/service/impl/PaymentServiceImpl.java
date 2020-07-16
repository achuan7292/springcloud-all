package com.hou.springcloud.service.impl;

import com.hou.springcloud.dao.PaymentDao;
import com.hou.springcloud.entities.Payment;
import com.hou.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName PaymentServiceImpl
 * @Description TODO
 * @Author ithou1297087292
 * @Date 2020/7/13 11:06
 * @Version 1.0
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    //java自带的依赖注入
    @Resource
//    @Autowired
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
