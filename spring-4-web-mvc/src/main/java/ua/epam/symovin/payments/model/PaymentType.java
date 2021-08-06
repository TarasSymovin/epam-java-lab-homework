package ua.epam.symovin.payments.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
@AllArgsConstructor
public class PaymentType {
    private int paymentTypeId;
    private BigDecimal commission;
    private String paymentName;
}
