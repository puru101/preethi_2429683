package com.item.app.common;

public class UserDto {
	private Long id;
    private String firstName;
    private String email;
    
	public UserDto(Long id, String firstName,  String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.email = email;
	}

	public UserDto() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
    
    

}
