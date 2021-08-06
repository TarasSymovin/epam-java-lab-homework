package ua.epam.symovin.payments.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ua.epam.symovin.payments.api.BankCardApi;
import ua.epam.symovin.payments.controller.assembler.BankCardAssembler;
import ua.epam.symovin.payments.controller.model.BankCardModel;
import ua.epam.symovin.payments.dto.BankCardDto;
import ua.epam.symovin.payments.service.BankCardService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class BankCardController implements BankCardApi {
    private final BankCardService bankCardService;
    private final BankCardAssembler bankCardAssembler;

    public BankCardModel getBankCard(@PathVariable int id){
        return bankCardAssembler.toModel(bankCardService.getBankCard(id));
    }

    public List<BankCardModel> getBankCardsForUser(@PathVariable int id){
        List<BankCardDto> bankCardDtoList = bankCardService.getBankCardsForUser(id);
        return bankCardDtoList.stream()
                .map(bankCardAssembler::toModel)
                .collect(Collectors.toList());
    }

    public BankCardModel addBankCard(@PathVariable int userId){
        return bankCardAssembler.toModel(bankCardService.createBankCard(userId));
    }

    public ResponseEntity<Void> deleteBankCard(@PathVariable int id){
        bankCardService.deleteBankCard(id);
        return ResponseEntity.noContent().build();
    }
}
