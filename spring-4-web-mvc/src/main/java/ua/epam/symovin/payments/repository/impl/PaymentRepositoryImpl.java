package ua.epam.symovin.payments.repository.impl;

import org.springframework.stereotype.Component;
import ua.epam.symovin.payments.model.Payment;
import ua.epam.symovin.payments.repository.PaymentRepository;

import java.math.BigDecimal;
import java.util.List;

@Component
public class PaymentRepositoryImpl implements PaymentRepository {
    @Override
    public Payment getPaymentById(int id) {
        return Payment.builder().paymentId(id).paymentSum(BigDecimal.valueOf(500)).build();
    }

    @Override
    public List<Payment> getPaymentsForBankCard(int id) {
        return null;
    }

    @Override
    public Payment createPayment(Payment payment) {
        return null;
    }

    @Override
    public Payment confirmPayment(int id) {
        return null;
    }

    @Override
    public void deletePayment(int id) {

    }
}
