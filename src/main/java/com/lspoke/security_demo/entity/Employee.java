package com.lspoke.security_demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
    private Long id;
    private String firstName;
    private String lastName;
}
