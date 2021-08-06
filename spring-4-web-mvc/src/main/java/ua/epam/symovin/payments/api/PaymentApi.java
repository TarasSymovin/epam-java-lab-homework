package ua.epam.symovin.payments.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.epam.symovin.payments.controller.model.PaymentModel;
import ua.epam.symovin.payments.dto.PaymentDto;

import java.util.List;

@Api(tags = "Payment management API")
@RequestMapping("/payments")
public interface PaymentApi {

    @ApiOperation("Get payment")
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    PaymentModel getPayment(@PathVariable int id);

    @ApiOperation("Get payments for bank card")
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("bankCard/{cardId}")
    List<PaymentModel> getPaymentForBankCard(@PathVariable int cardId);

    @ApiOperation("Create payment")
    @ResponseStatus(HttpStatus.CREATED)
    @PutMapping
    PaymentModel addPayment(@RequestBody PaymentDto paymentDto);

    @ApiOperation("Confirm payment")
    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/{id}")
    PaymentModel confirmPayment(@PathVariable int id);

    @ApiOperation("Delete payment")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    ResponseEntity<Void> deletePayment(@PathVariable int id);
}
