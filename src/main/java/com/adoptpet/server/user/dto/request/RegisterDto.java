package com.adoptpet.server.user.dto.request;

import com.adoptpet.server.user.domain.Member;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@Setter
public class RegisterDto {

    @NotBlank
    private String email;
    @NotBlank
    private String address;
    @NotBlank
    private String nickname;
    @NotBlank
    private String provider;
    private Integer imgNo;

    public Member toEntity() {
        return Member.builder()
                .email(email)
                .address(address)
                .nickname(nickname)
                .platform(provider)
                .regDate(LocalDateTime.now())
                .passModDate(LocalDateTime.now())
                .nickModDate(LocalDateTime.now())
                .build();
    }

}