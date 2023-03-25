package RestaurantManagement.service.serviceInterface;

import RestaurantManagement.dto.EmployeeDto;


import java.util.List;

public interface EmployeeServiceInterface {
    List<EmployeeDto> getAllBus();
    EmployeeDto getBussById(Integer id);
    EmployeeDto saveBuss(EmployeeDto body);
    EmployeeDto updateBuss1(EmployeeDto body);
    EmployeeDto updateBuss2(EmployeeDto body);
    EmployeeDto deleteBussById(Integer id);

}
