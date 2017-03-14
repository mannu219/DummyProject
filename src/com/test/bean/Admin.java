package com.test.bean;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

public class Admin {
	@NotEmpty
	@Length(min=8,max=15)
	 private String username;
	@NotEmpty
	@Length(min=2,max=15)
	    private String password;
	    
	    public Admin(String username, String password) {
 
			this.username = username;
			this.password = password;
		}
		
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		
		public void setPassword(String password) {
			this.password = password;
		}
	    
}
