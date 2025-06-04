// src/main/java/com/insurance/auth/dto/LoginRequest.java
package com.insurance.auth.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LoginRequest {
    private String email;
    private String password;
}
