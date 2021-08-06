package ua.epam.symovin.payments.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ua.epam.symovin.payments.dto.PaymentDto;
import ua.epam.symovin.payments.model.Payment;
import ua.epam.symovin.payments.repository.PaymentRepository;
import ua.epam.symovin.payments.service.MappingService;
import ua.epam.symovin.payments.service.PaymentService;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {
    private final MappingService mappingService;
    private final PaymentRepository paymentRepository;

    @Override
    public PaymentDto getPayment(int id) {
        log.info("Get payment by id {}", id);
        return mappingService.mapPaymentToPaymentDto(paymentRepository.getPaymentById(id));
    }

    @Override
    public List<PaymentDto> getPaymentsByCard(int id) {
        log.info("Get payments for user with id {}", id);
        List<Payment> payment = paymentRepository.getPaymentsForBankCard(id);
        return payment.stream()
                .map(mappingService::mapPaymentToPaymentDto)
                .collect(Collectors.toList());
    }

    @Override
    public PaymentDto createPayment(PaymentDto paymentDto) {
        log.info("Create payment with id {}", paymentDto.getPaymentId());
        return mappingService.mapPaymentToPaymentDto(
                paymentRepository.createPayment(mappingService.mapPaymentDtoToPayment(paymentDto)));
    }

    @Override
    public PaymentDto confirmPayment(int id) {
        log.info("Confirm payment with id {}", id);
        return mappingService.mapPaymentToPaymentDto(paymentRepository.confirmPayment(id));
    }

    @Override
    public void deletePayment(int id) {
        log.info("Delete payment with id {}", id);
        paymentRepository.deletePayment(id);
    }
}
