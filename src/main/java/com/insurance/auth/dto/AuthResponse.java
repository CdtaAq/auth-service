// src/main/java/com/insurance/auth/dto/AuthResponse.java
package com.insurance.auth.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AuthResponse {
    private String accessToken;
    private String refreshToken;
    private String role;
}
