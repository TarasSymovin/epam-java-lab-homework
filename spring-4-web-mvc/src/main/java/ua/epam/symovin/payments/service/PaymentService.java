package ua.epam.symovin.payments.service;

import ua.epam.symovin.payments.dto.PaymentDto;

import java.util.List;

public interface PaymentService {
    PaymentDto getPayment(int id);

    List<PaymentDto> getPaymentsByCard(int id);

    PaymentDto createPayment(PaymentDto paymentDto);

    PaymentDto confirmPayment(int id);

    void deletePayment(int id);
}
