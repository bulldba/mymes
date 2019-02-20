package com.tianma.mes.employee;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

/**
 * mes -com.tianma.mes.employee
 * Description:
 *
 * @author: Gary Cheung(bulldba@outlook.com)
 * @date: 2019-02-01
 * @time: 09:50
 * @version: 1.0
 **/

@CacheConfig(cacheNames = "emp")
public class Employee {
	private Integer id;

	private String name;


	@Cacheable(cacheNames = "emp", key = "#id")
	public int insertEmp(Employee employee) {
		return employee.id;
	}

	@CachePut(value = "emp", key = "#id")
	public Employee updateEmp(Employee employee) {
		return employee;
	}

}
