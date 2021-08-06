package ua.epam.symovin.payments.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.epam.symovin.payments.api.PaymentApi;
import ua.epam.symovin.payments.controller.assembler.PaymentAssembler;
import ua.epam.symovin.payments.controller.model.PaymentModel;
import ua.epam.symovin.payments.dto.PaymentDto;
import ua.epam.symovin.payments.service.PaymentService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class PaymentController implements PaymentApi {
    private final PaymentService paymentService;
    private final PaymentAssembler paymentAssembler;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public PaymentModel getPayment(@PathVariable int id){
        return paymentAssembler.toModel(paymentService.getPayment(id));
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("bankCard/{cardId}")
    public List<PaymentModel> getPaymentForBankCard(@PathVariable int cardId){
        List<PaymentDto> paymentDtoList = paymentService.getPaymentsByCard(cardId);
        return paymentDtoList.stream()
                .map(paymentAssembler::toModel)
                .collect(Collectors.toList());
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PutMapping
    public PaymentModel addPayment(@RequestBody PaymentDto paymentDto){
        return paymentAssembler.toModel(paymentService.createPayment(paymentDto));
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/{id}")
    public PaymentModel confirmPayment(@PathVariable int id){
        return paymentAssembler.toModel(paymentService.confirmPayment(id));
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePayment(@PathVariable int id){
        paymentService.deletePayment(id);
        return ResponseEntity.noContent().build();
    }
}
