package com.internship.prime.domain.dtos.userDtos;

import com.internship.prime.domain.enums.Role;
import lombok.Data;

@Data
public class UserResponseDto {

    private String userName;
    private String email;
    private Role role;

}
