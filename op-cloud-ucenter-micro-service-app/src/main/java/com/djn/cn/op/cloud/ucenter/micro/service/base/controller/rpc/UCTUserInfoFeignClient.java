package com.djn.cn.op.cloud.ucenter.micro.service.base.controller.rpc;



import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.djn.cn.op.cloud.base.micro.service.base.api.MdmItemCodeFeignApi;
import com.djn.cn.op.cloud.base.micro.service.base.model.dto.ItemCodeDTO;
import com.djn.cn.op.cloud.ucenter.micro.service.base.api.UCTUserInfoFeignApi;
import com.djn.cn.op.cloud.ucenter.micro.service.base.entity.UserInfo;
import com.djn.cn.op.cloud.ucenter.micro.service.base.model.dto.UserInfoDTO;
import com.djn.cn.op.cloud.ucenter.micro.service.base.service.IUserInfoService;
import com.djn.cn.op.common.service.model.ServiceReturn;
import com.djn.cn.op.common.service.util.ServiceReturnUtil;

import io.swagger.annotations.ApiOperation;


@RestController
public class UCTUserInfoFeignClient implements  UCTUserInfoFeignApi{
	private static final Logger logger = LoggerFactory.getLogger(UCTUserInfoFeignClient.class);
	@Autowired
	private IUserInfoService iUserInfoService;
	@Autowired
	private MdmItemCodeFeignApi mdmItemCodeFeignApi;
	@Override
	@ApiOperation(httpMethod = "GET", value = " 通过 id 查询 UserInfoDTO 列表")
	public ServiceReturn<UserInfoDTO> findById(@PathVariable("id") Long id) {
		logger.info("uct[]UCTUserInfoFeignClient[]findById[]id=[{}]", id);	
		UserInfoDTO userInfoDTO = new UserInfoDTO();
		UserInfo userInfo = iUserInfoService.selectByPrimaryKey(id);
		if(userInfo !=  null ){
			BeanUtils.copyProperties(userInfo, userInfoDTO);
		}
		return ServiceReturnUtil.ok(userInfoDTO);
	}
	@Override
	public ServiceReturn<String > getSexById(@PathVariable("id") Long id) {
		ServiceReturn<List<ItemCodeDTO>> serviceReturn = mdmItemCodeFeignApi.getByCategory("sex");
		if (serviceReturn != null ){
			System.out.println("DDDDD" + serviceReturn.getData().size());
		}
		return ServiceReturnUtil.ok("男");
	}
}
