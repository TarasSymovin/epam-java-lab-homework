package ua.epam.symovin.payments.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ua.epam.symovin.payments.dto.BankCardDto;
import ua.epam.symovin.payments.service.BankCardService;

import java.util.List;

@RestController
@RequestMapping("/bankCard")
@RequiredArgsConstructor
public class BankCardController {
    private final BankCardService bankCardService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public BankCardDto getBankCard(@PathVariable int id){
        return bankCardService.getBankCard(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("userCards/{id}")
    public List<BankCardDto> getBankCardsForUser(@PathVariable int id){
        return bankCardService.getBankCardsForUser(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PutMapping("/{userId}")
    public BankCardDto addBankCard(@PathVariable int userId){
        return bankCardService.createBankCard(userId);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void deleteBankCard(@PathVariable int id){
        bankCardService.deleteBankCard(id);
    }
}
