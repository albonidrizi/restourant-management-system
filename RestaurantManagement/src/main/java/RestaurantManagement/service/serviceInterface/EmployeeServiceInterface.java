package RestaurantManagement.service.serviceInterface;

import RestaurantManagement.dto.EmployeeDto;


import java.util.List;

public interface EmployeeServiceInterface {
    List<EmployeeDto> getAllEmployee();
    EmployeeDto getEmployeeById(Integer id);
    EmployeeDto saveEmployee(EmployeeDto body);
    EmployeeDto updateEmployee1(EmployeeDto body);
    EmployeeDto updateEmployee2(EmployeeDto body);
    EmployeeDto deleteEmployeeById(Integer id);

}
