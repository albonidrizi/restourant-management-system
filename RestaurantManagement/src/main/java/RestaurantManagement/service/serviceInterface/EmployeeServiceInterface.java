package RestaurantManagement.service.serviceInterface;

import RestaurantManagement.dto.EmployeeDto;
import org.springframework.data.domain.Page;


import java.util.List;

public interface EmployeeServiceInterface {
    List<EmployeeDto> getAllEmployee();
    EmployeeDto getEmployeeById(Integer id);
    EmployeeDto saveEmployee(EmployeeDto body);
    EmployeeDto updateEmployee1(EmployeeDto body);
    EmployeeDto updateEmployee2(EmployeeDto body);
    EmployeeDto deleteEmployeeById(Integer id);

    Page<EmployeeDto> employeesFilter(Integer pageSize, Integer pageNumber, String sort, Boolean isAscending, String name, String address, Integer professionId);
}
