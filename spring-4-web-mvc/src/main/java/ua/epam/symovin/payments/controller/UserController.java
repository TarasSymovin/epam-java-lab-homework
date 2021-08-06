package ua.epam.symovin.payments.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import ua.epam.symovin.payments.api.UserApi;
import ua.epam.symovin.payments.controller.assembler.UserAssembler;
import ua.epam.symovin.payments.controller.model.UserModel;
import ua.epam.symovin.payments.dto.UserDto;
import ua.epam.symovin.payments.service.UserService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class UserController implements UserApi {
    private final UserService userService;
    private final UserAssembler userAssembler;

    @Override
    public UserModel getUser(int id){
        return userAssembler.toModel(userService.getUser(id));
    }

    @Override
    public List<UserModel> getUsers(){
        List<UserDto> userDtoList = userService.getUsers();
        return userDtoList.stream()
                .map(userAssembler::toModel)
                .collect(Collectors.toList());
    }

    @Override
    public UserModel addUser(UserDto userDto){
        return userAssembler.toModel(userService.createUser(userDto));
    }

    @Override
    public UserModel updateUser(int id, UserDto userDto){
        return userAssembler.toModel(userService.updateUser(id, userDto));
    }

    @Override
    public ResponseEntity<Void> deleteUser(int id){
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }
}
