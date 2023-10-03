package com.webapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Agent {
	
	@Id
	private int aid;
	
	private String agent_name;
	private String agent_role;
	
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAgent_name() {
		return agent_name;
	}
	public void setAgent_name(String agent_name) {
		this.agent_name = agent_name;
	}
	public String getAgent_role() {
		return agent_role;
	}
	public void setAgent_role(String agent_role) {
		this.agent_role = agent_role;
	}
	
	@Override
	public String toString() {
		return "Agent [aid=" + aid + ", agent_name=" + agent_name + ", agent_role=" + agent_role + "]";
	}

}
