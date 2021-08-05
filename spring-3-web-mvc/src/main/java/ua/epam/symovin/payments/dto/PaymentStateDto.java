package ua.epam.symovin.payments.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class PaymentStateDto {
    private int paymentStateId;
    private String paymentState;
}
