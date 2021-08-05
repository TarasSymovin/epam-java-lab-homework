package ua.epam.symovin.payments.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ua.epam.symovin.payments.dto.UserDto;
import ua.epam.symovin.payments.model.User;
import ua.epam.symovin.payments.repository.UserRepository;
import ua.epam.symovin.payments.service.MappingService;
import ua.epam.symovin.payments.service.UserService;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final MappingService mappingService;

    @Override
    public UserDto getUser(int id) {
        log.info("Get user by id {}", id);
        return mappingService.mapUserToUserDto(userRepository.getUser(id));
    }

    @Override
    public List<UserDto> getUsers() {
        log.info("Get all users");
        List<User> users = userRepository.getUsers();
        return users.stream()
                .map(mappingService::mapUserToUserDto)
                .collect(Collectors.toList());
    }

    @Override
    public UserDto createUser(UserDto userDto) {
        log.info("Create user with id {}", userDto.getUserId());
        User user = mappingService.mapUserDtoToUser(userDto);
        userRepository.createUser(user);
        return userDto;
    }

    @Override
    public UserDto updateUser(int id, UserDto userDto) {
        log.info("Update user with id {}", id);
        User user = mappingService.mapUserDtoToUser(userDto);
        userRepository.updateUser(id, user);
        return userDto;
    }

    @Override
    public void deleteUser(int id) {
        log.info("Delete user with id {}", id);
        userRepository.deleteUser(id);
    }
}
