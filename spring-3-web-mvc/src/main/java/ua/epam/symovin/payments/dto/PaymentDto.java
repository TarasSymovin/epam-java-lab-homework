package ua.epam.symovin.payments.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentDto {
    private int paymentId;
    private BigDecimal paymentSum;
    private String description;
    private Timestamp paymentDateTime;

    private BankCardDto recipientCard;
    private BankCardDto senderCard;
    private PaymentStateDto paymentState;
    private PaymentTypeDto paymentType;
}
