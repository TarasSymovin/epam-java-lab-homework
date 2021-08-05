package ua.epam.symovin.payments.repository;

import ua.epam.symovin.payments.model.Payment;

import java.util.List;

public interface PaymentRepository {
    Payment getPaymentById(int id);

    List<Payment> getPaymentsForBankCard(int id);

    Payment createPayment(Payment payment);

    Payment confirmPayment(int id);

    void deletePayment(int id);
}
