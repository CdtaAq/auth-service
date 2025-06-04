// src/main/java/com/insurance/auth/dto/RegisterRequest.java
package com.insurance.auth.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RegisterRequest {
    private String email;
    private String password;
}
