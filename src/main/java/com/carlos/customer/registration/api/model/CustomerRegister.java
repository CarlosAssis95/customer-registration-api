package com.carlos.customer.registration.api.model;

import jakarta.persistence.Embedded;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.awt.print.Book;
import java.time.LocalDate;
import java.time.OffsetDateTime;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class CustomerRegister {
    @EqualsAndHashCode.Include
    private Long id;
    private String name;
    private String cpf;
    private String gender;
    private LocalDate birthDate;
    @Embedded
    private Address address;
    private Boolean active = Boolean.TRUE;
    private OffsetDateTime createDate;
    private OffsetDateTime update;
}
