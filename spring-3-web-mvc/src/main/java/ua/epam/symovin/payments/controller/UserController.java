package ua.epam.symovin.payments.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ua.epam.symovin.payments.dto.UserDto;
import ua.epam.symovin.payments.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{id}")
    public UserDto getUser(@PathVariable int id){
        return userService.getUser(id);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping()
    public List<UserDto> getUsers(){
        return userService.getUsers();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PutMapping
    public UserDto addUser(@RequestBody UserDto userDto){
        return userService.createUser(userDto);
    }

    @ResponseStatus(HttpStatus.OK)
    @PostMapping("/{id}")
    public UserDto updateUser(@PathVariable int id, @RequestBody UserDto userDto){
        return userService.updateUser(id, userDto);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable int id){
        userService.deleteUser(id);
    }
}
