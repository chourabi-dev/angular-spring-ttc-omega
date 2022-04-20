package com.grokonez.jwtauthentication.message.response;

public class AddIntervention {
	
	
	private String description;
	private long id_machine;
	private String parametersString;
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long getId_machine() {
		return id_machine;
	}
	public void setId_machine(long id_machine) {
		this.id_machine = id_machine;
	}
	public String getParametersString() {
		return parametersString;
	}
	public void setParametersString(String parametersString) {
		this.parametersString = parametersString;
	}
	public AddIntervention(String description, long id_machine, String parametersString) {
		super();
		this.description = description;
		this.id_machine = id_machine;
		this.parametersString = parametersString;
	}
	public AddIntervention() {
		super();
	}
	
	
	
}
