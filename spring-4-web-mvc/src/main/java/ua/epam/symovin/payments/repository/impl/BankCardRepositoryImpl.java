package ua.epam.symovin.payments.repository.impl;

import org.springframework.stereotype.Component;
import ua.epam.symovin.payments.model.BankCard;
import ua.epam.symovin.payments.repository.BankCardRepository;

import java.util.List;

@Component
public class BankCardRepositoryImpl implements BankCardRepository {
    @Override
    public BankCard getBankCard(int id) {
        return null;
    }

    @Override
    public List<BankCard> getBankCardsForUser(int userId) {
        return null;
    }

    @Override
    public BankCard createBankCard(BankCard bankCard) {
        return null;
    }

    @Override
    public BankCard updateBankCard(int id, BankCard bankCard) {
        return null;
    }

    @Override
    public void deleteBankCard(int id) {

    }
}
