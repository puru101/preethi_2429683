package com.item.app.common;

public class ResponseDto {

	private DeptDto department;
	private UserDto user;

	public ResponseDto() {
		super();
	}

	public ResponseDto(DeptDto department, UserDto user) {
		super();
		this.department = department;
		this.user = user;
	}

	public DeptDto getDepartment() {
		return department;
	}

	public void setDepartment(DeptDto department) {
		this.department = department;
	}

	public UserDto getUser() {
		return user;
	}

	public void setUser(UserDto user) {
		this.user = user;
	}

}
