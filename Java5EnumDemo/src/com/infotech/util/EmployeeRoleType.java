package com.infotech.util;

public enum EmployeeRoleType {
	ADMIN(10),DEV(20),MANAGER(30),HR(40);
	
	private final int roleCode;

	private EmployeeRoleType(int roleCode) {
		this.roleCode = roleCode;
	}
	
	public int getRoleCode() {
		return roleCode;
	}
}
