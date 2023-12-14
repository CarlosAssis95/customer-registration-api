package com.carlos.customer.registration.api.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class State {
    @EqualsAndHashCode.Include
    private Long id;
    private String name;

}
