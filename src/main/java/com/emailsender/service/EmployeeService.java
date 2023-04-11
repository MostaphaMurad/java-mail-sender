package com.emailsender.service;

import com.emailsender.models.Employees;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

/**
 * @author: Mostafa Murad
 * @created: 4/11/2023 on 12:07 PM
 **/
@NoRepositoryBean
public interface EmployeeService {
    List<Employees>getAllEmployees();
}
