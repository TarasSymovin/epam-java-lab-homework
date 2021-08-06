package ua.epam.symovin.payments.service;

import lombok.SneakyThrows;
import org.apache.commons.beanutils.BeanUtils;
import ua.epam.symovin.payments.dto.BankCardDto;
import ua.epam.symovin.payments.dto.PaymentDto;
import ua.epam.symovin.payments.dto.UserDto;
import ua.epam.symovin.payments.model.BankCard;
import ua.epam.symovin.payments.model.Payment;
import ua.epam.symovin.payments.model.User;

public interface MappingService {
    UserDto mapUserToUserDto(User user);

    User mapUserDtoToUser(UserDto userDto);

    BankCardDto mapBankCardToBankCardDto(BankCard bankCard);

    BankCard mapBankCardDtoToBankCard(BankCardDto bankCardDto);

    PaymentDto mapPaymentToPaymentDto(Payment payment);

    Payment mapPaymentDtoToPayment(PaymentDto paymentDto);

}
