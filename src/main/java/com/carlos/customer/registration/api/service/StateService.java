package com.carlos.customer.registration.api.service;

import com.carlos.customer.registration.api.dto.StateDto;
import com.carlos.customer.registration.api.mapper.StateMapper;
import com.carlos.customer.registration.api.model.State;
import com.carlos.customer.registration.api.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StateService {

    @Autowired
    private StateRepository stateRepository;
    @Autowired
    private StateMapper stateMapper;

    public List<StateDto> findAll(){
        List<State> states = stateRepository.findAll();
        return stateMapper.fromListStateToListStateDto(states);
    }
}
