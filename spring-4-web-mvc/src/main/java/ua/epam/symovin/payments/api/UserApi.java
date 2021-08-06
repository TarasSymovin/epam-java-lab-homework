package ua.epam.symovin.payments.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ua.epam.symovin.payments.controller.model.UserModel;
import ua.epam.symovin.payments.dto.UserDto;
import ua.epam.symovin.payments.dto.group.OnCreate;

import java.util.List;

@Api(tags = "User management API")
@RequestMapping("/users")
public interface UserApi {

    @ApiOperation("Get user")
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    UserModel getUser(@PathVariable int id);

    @ApiOperation("Get all users")
    @ResponseStatus(HttpStatus.OK)
    @GetMapping()
    List<UserModel> getUsers();

    @ApiOperation("Create user")
    @ResponseStatus(HttpStatus.CREATED)
    @PutMapping
    UserModel addUser(@Validated(OnCreate.class) @RequestBody UserDto userDto);

    @ApiOperation("Update user")
    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/{id}")
    UserModel updateUser(@PathVariable int id, @RequestBody UserDto userDto);

    @ApiOperation("Delete user")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    ResponseEntity<Void> deleteUser(@PathVariable int id);
}
