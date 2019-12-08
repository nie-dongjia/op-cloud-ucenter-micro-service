package com.djn.cn.op.cloud.ucenter.micro.service.base.hystrix;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.djn.cn.op.cloud.ucenter.micro.service.base.api.UCTUserInfoFeignApi;
import com.djn.cn.op.cloud.ucenter.micro.service.base.model.dto.UserInfoDTO;
import com.djn.cn.op.common.service.model.ServiceReturn;

@Component
public class UCTUserInfoFeignHystrix implements UCTUserInfoFeignApi{
	private static final Logger logger = LoggerFactory.getLogger(UCTUserInfoFeignHystrix.class);

	@Override
	public ServiceReturn<UserInfoDTO> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ServiceReturn<String> getSexById(Long id) {
		logger.error("UCTUserInfoFeignHystrix[]getSexById"+ id);
		// TODO Auto-generated method stub
		return null;
	}

}
