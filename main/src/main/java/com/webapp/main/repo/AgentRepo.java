package com.webapp.main.repo;


import org.springframework.data.repository.CrudRepository;

import com.webapp.model.Agent;

public interface AgentRepo extends CrudRepository<Agent, Integer> {

}
