package com.tianma.mes.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * mes -com.tianma.mes.employee
 * Description:
 *
 * @author: Gary Cheung(bulldba@outlook.com)
 * @date: 2019-02-01
 * @time: 09:49
 * @version: 1.0
 **/
@RestController
public class EmployeeController {

	@Autowired
	Employee employee;

}
