package ua.epam.symovin.payments.repository;

import ua.epam.symovin.payments.model.BankCard;

import java.util.List;

public interface BankCardRepository {
    BankCard getBankCard(int id);

    List<BankCard> getBankCardsForUser(int userId);

    BankCard createBankCard(BankCard bankCard);

    BankCard updateBankCard(int id, BankCard bankCard);

    void deleteBankCard(int id);
}
