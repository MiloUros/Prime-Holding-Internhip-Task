package com.internship.prime.domain.mappers;

import com.internship.prime.domain.dtos.userDtos.UserRequestDto;
import com.internship.prime.domain.dtos.userDtos.UserResponseDto;
import com.internship.prime.domain.entities.User;
import lombok.AccessLevel;
import lombok.Setter;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

@Mapper
public abstract class UserMapper {

    @Autowired
    @Setter(AccessLevel.PACKAGE)
    PasswordEncoder passwordEncoder;

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "password", expression = "java(passwordEncoder.encode(userRequestDto.getPassword()))")
    public abstract User userRequestDtoToEntity(UserRequestDto userRequestDto);

    public abstract UserResponseDto userToDto(User user);

}
