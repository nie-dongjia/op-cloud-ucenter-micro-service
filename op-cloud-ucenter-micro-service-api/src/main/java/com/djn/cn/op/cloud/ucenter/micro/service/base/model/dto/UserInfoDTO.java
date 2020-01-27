package com.djn.cn.op.cloud.ucenter.micro.service.base.model.dto;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;

@ApiModel
public class UserInfoDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	private Long id ;
    private String name;
    private String userName;
    private String email;
    
	public UserInfoDTO() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
