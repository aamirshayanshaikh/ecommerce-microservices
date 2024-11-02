package com.example.userservice.model.dto.request;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@RequiredArgsConstructor
public class UserDto {
    private Long id;
    private String fullname;
    private String username;
    private String email;
    private String gender;
    private String phone;
    private String avatar;
}
