package com.jpcchaves.hrpayroll.services;

import com.jpcchaves.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public Payment getPayment(long workerId, int days) {
        return new Payment("Zezin" , 200.00, days);
    }
}
