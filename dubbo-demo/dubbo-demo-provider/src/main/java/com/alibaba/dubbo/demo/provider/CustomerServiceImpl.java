package com.alibaba.dubbo.demo.provider;

import com.alibaba.dubbo.demo.CustomerService;

public class CustomerServiceImpl implements CustomerService{

	@Override
	public String queryCustomer(String name) {
		// TODO Auto-generated method stub
		System.err.println("=================="+name);
		return name;
	}
}
