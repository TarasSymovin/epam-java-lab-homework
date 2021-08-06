package ua.epam.symovin.payments.service.impl;

import lombok.SneakyThrows;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.stereotype.Service;
import ua.epam.symovin.payments.dto.BankCardDto;
import ua.epam.symovin.payments.dto.PaymentDto;
import ua.epam.symovin.payments.dto.UserDto;
import ua.epam.symovin.payments.model.BankCard;
import ua.epam.symovin.payments.model.Payment;
import ua.epam.symovin.payments.model.User;
import ua.epam.symovin.payments.service.MappingService;

@Service
public class MappingServiceImpl implements MappingService {
    @SneakyThrows
    @Override
    public UserDto mapUserToUserDto(User user){
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(userDto, user);
        return userDto;
    }

    @SneakyThrows
    @Override
    public User mapUserDtoToUser(UserDto userDto){
        User user = new User();
        BeanUtils.copyProperties(user, userDto);
        return user;
    }

    @SneakyThrows
    @Override
    public BankCardDto mapBankCardToBankCardDto(BankCard bankCard){
        BankCardDto bankCardDto = new BankCardDto();
        BeanUtils.copyProperties(bankCardDto, bankCard);
        return bankCardDto;
    }

    @SneakyThrows
    @Override
    public BankCard mapBankCardDtoToBankCard(BankCardDto bankCardDto){
        BankCard bankCard = new BankCard();
        BeanUtils.copyProperties(bankCard, bankCardDto);
        return bankCard;
    }

    @SneakyThrows
    @Override
    public PaymentDto mapPaymentToPaymentDto(Payment payment) {
        PaymentDto paymentDto = new PaymentDto();
        BeanUtils.copyProperties(paymentDto, payment);
        return paymentDto;
    }

    @SneakyThrows
    @Override
    public Payment mapPaymentDtoToPayment(PaymentDto paymentDto) {
        Payment payment = new Payment();
        BeanUtils.copyProperties(payment, paymentDto);
        return payment;
    }
}
