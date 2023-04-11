package com.emailsender.service.imp;

import com.emailsender.models.Employees;
import com.emailsender.repository.EmployeeRepository;
import com.emailsender.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: Mostafa Murad
 * @created: 4/11/2023 on 12:07 PM
 **/
@Service
@RequiredArgsConstructor
public class EmployeeServiceImp implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Override
    public List<Employees> getAllEmployees() {
        return employeeRepository.findAll();
    }
}
