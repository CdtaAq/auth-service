// src/main/java/com/insurance/auth/dto/AuthRequest.java
package com.insurance.auth.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AuthRequest {
    private String email;
    private String password;
}
