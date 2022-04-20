package com.grokonez.jwtauthentication.message.request;

import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class EditRequest {
	
    private long id;
	    @NotBlank
	    @Size(min = 3, max = 50)
	    private String name;

	    @NotBlank
	    @Size(min = 3, max = 50)
	    private String username;

	    @NotBlank
	    @Size(max = 60)
	    @Email
	    private String email;
	    
	    private Set<String> role;

	    
	    @NotBlank
	    @Size(min = 6, max = 40)
	    private String cindId;
	    
	    

	    public String getCindId() {
			return cindId;
		}

		public void setCindId(String cindId) {
			this.cindId = cindId;
		}



		public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getUsername() {
	        return username;
	    }

	    public void setUsername(String username) {
	        this.username = username;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }


	    
	    public Set<String> getRole() {
	    	return this.role;
	    }
	    
	    public void setRole(Set<String> role) {
	    	this.role = role;
	    }

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}
	    
	    
}
