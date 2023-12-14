package com.carlos.customer.registration.api.repository;

import com.carlos.customer.registration.api.model.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends JpaRepository<State, Long> {
}
