package ua.epam.symovin.payments.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class UserTypeDto {
    private int typeId;
    private String userType;
}
