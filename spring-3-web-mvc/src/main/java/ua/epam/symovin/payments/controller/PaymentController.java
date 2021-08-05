package ua.epam.symovin.payments.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ua.epam.symovin.payments.dto.PaymentDto;
import ua.epam.symovin.payments.service.PaymentService;

import java.util.List;

@RestController
@RequestMapping("/payments")
@RequiredArgsConstructor
public class PaymentController {
    private final PaymentService paymentService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public PaymentDto getPayment(@PathVariable int id){
        return paymentService.getPayment(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("bankCard/{cardId}")
    public List<PaymentDto> getPaymentForBankCard(@PathVariable int cardId){
        return paymentService.getPaymentsByCard(cardId);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PutMapping
    public PaymentDto addPayment(@RequestBody PaymentDto paymentDto){
        return paymentService.createPayment(paymentDto);
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/{id}")
    public PaymentDto confirmPayment(@PathVariable int id){
        return paymentService.confirmPayment(id);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void deleteBankCard(@PathVariable int id){
        paymentService.deletePayment(id);
    }
}
