package ua.epam.symovin.payments.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BankCardDto {
    private int cardId;
    private String cardNumber;
    private String cardIban;
    private BigDecimal cardBalance;
    private boolean block;
    private boolean request;

    private UserDto user;
    private List<PaymentDto> payments;
}
