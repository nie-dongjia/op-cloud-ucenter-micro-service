package com.djn.cn.op.cloud.ucenter.micro.service.base.api;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.djn.cn.op.cloud.common.config.FeignConfig;
import com.djn.cn.op.cloud.ucenter.micro.service.base.hystrix.UCTUserInfoFeignHystrix;
import com.djn.cn.op.cloud.ucenter.micro.service.base.model.dto.UserInfoDTO;
import com.djn.cn.op.common.service.model.ServiceReturn;

/**
 * 
 * <b>类   名：</b>UTCUserInfoFeignApi<br/>
 * <b>类描述：</b>The interface UTC  UserInfo feign api. <br/>
 * <b>创建人：</b>op.nie-dongjia<br/>
 * <b>创建时间：</b>2019年12月8日 上午10:37:37<br/>
 * <b>修改人：</b>op.nie-dongjia<br/>
 * <b>修改时间：</b>2019年12月8日 上午10:37:37<br/>
 * <b>修改备注：</b><br/>
 *
 * @version   1.0<br/>
 *
 */
@FeignClient(value = "ucenter-micro-service",configuration = FeignConfig.class,fallback = UCTUserInfoFeignHystrix.class)
public interface UCTUserInfoFeignApi {
	/**
	 * 
	 * getById  通过 id 查询 UserInfoDTO 列表
	 *
	 * @param category
	 * @return   
	 * @since 1.0
	 * @author op.nie-dongjia
	 */
	@GetMapping(value = "/api/user/getById/{id}" , produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	ServiceReturn<UserInfoDTO> findById(@PathVariable("id") Long id);
	/**
	 * 
	 * getById  通过 id 查询 UserInfoDTO 列表
	 *
	 * @param category
	 * @return   
	 * @since 1.0
	 * @author op.nie-dongjia
	 */
	@PostMapping(value = "/api/user/getSexById/{id}")
	ServiceReturn<String> getSexById(@PathVariable("id") Long id);
}
