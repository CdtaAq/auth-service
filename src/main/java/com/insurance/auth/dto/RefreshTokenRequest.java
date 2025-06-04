// src/main/java/com/insurance/auth/dto/RefreshTokenRequest.java
package com.insurance.auth.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RefreshTokenRequest {
    private String token;
}
