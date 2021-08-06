package ua.epam.symovin.payments.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.epam.symovin.payments.controller.model.BankCardModel;

import java.util.List;

@Api(tags = "Bank card management API")
@RequestMapping("/bankCard")
public interface BankCardApi {
    @ApiOperation("Get bank card")
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    BankCardModel getBankCard(@PathVariable int id);

    @ApiOperation("Get bank cards for user")
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("userCards/{id}")
    List<BankCardModel> getBankCardsForUser(@PathVariable int id);

    @ApiOperation("Create bank card")
    @ResponseStatus(HttpStatus.CREATED)
    @PutMapping("/{userId}")
    BankCardModel addBankCard(@PathVariable int userId);

    @ApiOperation("Delete bank card")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    ResponseEntity<Void> deleteBankCard(@PathVariable int id);
}
