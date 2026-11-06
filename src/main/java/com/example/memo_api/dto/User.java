package com.example.memo_api.dto;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class User {
    private long id;
    private String username;
    private String password;
    private LocalDateTime createdAt;
}
