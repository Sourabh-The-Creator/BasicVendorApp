package com.sourabh.vendorapp.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Vendor {
    @Id
    private Integer id;
    private String name;
    private String code;
    private String type;
    private String email;
    private String phone;
}
