package com.infotech.client;

import com.infotech.util.EmployeeRoleType;

public class ClientTest2 {

	public static void main(String[] args) {
		EmployeeRoleType[] values = EmployeeRoleType.values();
		for (EmployeeRoleType employeeRoleType : values) {
			System.out.println(employeeRoleType + "\t"
					+ employeeRoleType.getRoleCode());
		}
		System.out.println("-------------------------");

		EmployeeRoleType roleType = EmployeeRoleType.MANAGER;
		switch (roleType) {
		case ADMIN:
				System.out.println("Admin task");
			break;

		case DEV:
			System.out.println("Dev task");
			break;

		case MANAGER:
			System.out.println("Manager task");
			break;

		case HR:
			System.out.println("HAR task");
			break;

		default:
			System.out.println("Invalid role type");
			break;
		}
	}
}
