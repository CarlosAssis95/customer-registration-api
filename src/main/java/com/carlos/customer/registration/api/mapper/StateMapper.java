package com.carlos.customer.registration.api.mapper;

import com.carlos.customer.registration.api.dto.StateDto;
import com.carlos.customer.registration.api.model.State;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class StateMapper {
    @Autowired
    private ModelMapper mapper;

    public StateDto fromStateToStateDto(State state){
        return mapper.map(state, StateDto.class);
    }

    public List<StateDto> fromListStateToListStateDto(List<State> states){
        return states.stream()
                .map(state -> fromStateToStateDto(state))
                .collect(Collectors.toList());
    }
}
