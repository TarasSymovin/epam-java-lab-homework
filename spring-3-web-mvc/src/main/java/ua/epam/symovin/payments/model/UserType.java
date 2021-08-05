package ua.epam.symovin.payments.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class UserType {
    private int typeId;
    private String userType;
}
