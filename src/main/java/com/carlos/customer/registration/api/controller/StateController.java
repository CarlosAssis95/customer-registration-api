package com.carlos.customer.registration.api.controller;

import com.carlos.customer.registration.api.dto.StateDto;
import com.carlos.customer.registration.api.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/states")
public class StateController {

    @Autowired
    private StateService stateService;

    @GetMapping
    public List<StateDto> findAll(){
        return stateService.findAll();
    }
}
