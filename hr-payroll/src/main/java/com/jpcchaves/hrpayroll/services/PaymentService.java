package com.jpcchaves.hrpayroll.services;

import com.jpcchaves.hrpayroll.entities.Payment;
import com.jpcchaves.hrpayroll.entities.Worker;
import com.jpcchaves.hrpayroll.feignclients.WorkerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {


    @Autowired
    private WorkerFeignClient workerFeignClient;

    public Payment getPayment(long workerId, int days) {

        Worker worker = workerFeignClient.findById(workerId).getBody();

        assert worker != null;
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
}
