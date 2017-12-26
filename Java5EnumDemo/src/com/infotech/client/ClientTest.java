package com.infotech.client;

import com.infotech.util.RoleType;

public class ClientTest {

	public static void main(String[] args) {
		
		RoleType roleType = RoleType.DEV;
		System.out.println(roleType);
		
		RoleType[] values = RoleType.values();
		for (RoleType roleType2 : values) {
			System.out.println(roleType2 +"\t"+roleType2.ordinal());
		}
	}
}
