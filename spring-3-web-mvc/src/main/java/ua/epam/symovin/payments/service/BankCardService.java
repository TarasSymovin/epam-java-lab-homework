package ua.epam.symovin.payments.service;

import ua.epam.symovin.payments.dto.BankCardDto;
import ua.epam.symovin.payments.dto.UserDto;

import java.util.List;

public interface BankCardService {
    List<BankCardDto> getBankCardsForUser(int id);

    BankCardDto getBankCard(int id);

    BankCardDto createBankCard(int id);

    void deleteBankCard(int id);
}
