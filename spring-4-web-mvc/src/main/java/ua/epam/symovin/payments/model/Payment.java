package ua.epam.symovin.payments.model;

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
public class Payment {
    private int paymentId;
    private BigDecimal paymentSum;
    private String description;
    private Timestamp paymentDateTime;

    private BankCard recipientCard;
    private BankCard senderCard;
    private PaymentState paymentState;
    private PaymentType paymentType;
}
