package com.yjq.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.yjq.service.IUserService;

@Service
public class UserService implements IUserService{
	/*@Resource
	private UserDao userdao;
	*/
	public void testQuery() {
		//return userdao.queryData();
		System.out.println("hello dubbo~");
	}

}
