package ua.epam.symovin.payments.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ua.epam.symovin.payments.dto.group.OnCreate;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private int userId;

    @NotBlank(groups = OnCreate.class)
    private String login;

    @NotBlank(groups = OnCreate.class)
    private String password;

    private boolean active;

    private UserInfoDto userInfo;

    private UserTypeDto userType;

    private List<BankCardDto> bankCards;
}
