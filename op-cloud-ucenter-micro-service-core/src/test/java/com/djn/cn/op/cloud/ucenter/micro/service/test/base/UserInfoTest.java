package com.djn.cn.op.cloud.ucenter.micro.service.test.base;


import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.djn.cn.op.cloud.ucenter.micro.service.base.dao.UserInfoMapper;
import com.djn.cn.op.cloud.ucenter.micro.service.base.entity.UserInfo;
import com.djn.cn.op.cloud.ucenter.micro.service.base.service.IUserInfoService;
import com.djn.cn.op.cloud.ucenter.micro.service.test.AbstractTestCase;



public class UserInfoTest extends AbstractTestCase{
	@Autowired
	private IUserInfoService iUserInfoService;
	@Autowired
	private UserInfoMapper userInfoMapper;
	@Test
	public void selectAllTest() {
		System.out.println("AAAAA:" + iUserInfoService.selectAll().size());
		System.out.println("AAAAA:" + userInfoMapper.selectAll().size());
	}	
	@Test
	public void insertTest() {
		UserInfo userInfo = new UserInfo();
		userInfo.setCreateTime(new Date());
		userInfo.setUserName("admin");
		userInfo.setName("管理员");
		userInfo.setQq(327803131+"");
		userInfo.setEmail("327803131@qq.com");
		int i = iUserInfoService.insertSelective(userInfo);
		System.out.println("插入" + i);
		System.out.println("插入" + userInfo.getId());
		
	}	
}
