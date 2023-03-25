package RestaurantManagement.mapper.MapperInterface;

import RestaurantManagement.dto.EmployeeDto;
import RestaurantManagement.model.Employee;

public interface EmployeeMapperInterface {

    Employee toEntity (EmployeeDto dto);

    EmployeeDto toDto (Employee entity);
}
