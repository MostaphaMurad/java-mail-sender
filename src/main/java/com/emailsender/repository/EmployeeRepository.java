package com.emailsender.repository;
import com.emailsender.models.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: Mostafa Murad
 * @created: 4/11/2023 on 11:59 AM
 **/
public interface EmployeeRepository extends JpaRepository<Employees,Long> {
}
