package com.project4.trip.user;

import lombok.Data;

@Data
public class UserVO {
	private int userseq;
	private String id;
	private String pw;
	private String name;
	private String mobile;
	private String address;
}
