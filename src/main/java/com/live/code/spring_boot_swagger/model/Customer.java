package com.live.code.spring_boot_swagger.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Customer {
    private String id;
    private String name;
    private String phoneNumber;
    private String email;
}
