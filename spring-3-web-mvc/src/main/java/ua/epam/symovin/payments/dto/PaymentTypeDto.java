package ua.epam.symovin.payments.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
@AllArgsConstructor
public class PaymentTypeDto {
    private int paymentTypeId;
    private BigDecimal commission;
    private String paymentName;
}
