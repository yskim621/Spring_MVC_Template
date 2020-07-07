package com.pk.MVC.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class User {
	private String name;
	private String phone;
	private int age;
	// 월2자리/일2자리/년도4자리 형식의 문자열로 입려해도 Date로 변환
	@DateTimeFormat(pattern="MM/dd/yyyy")
	private Date birthday;
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	@Override
	public String toString() {
		return "User [name=" + name + ", phone=" + phone + ", age=" + age + "]";
	}
	
	
}
