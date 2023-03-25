package RestaurantManagement.mapper;

import RestaurantManagement.dto.EmployeeDto;
import RestaurantManagement.mapper.MapperInterface.EmployeeMapperInterface;
import RestaurantManagement.mapper.MapperInterface.ProfessionMapperInterface;
import RestaurantManagement.model.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class EmployeeMapperImpl implements EmployeeMapperInterface {

    private ProfessionMapperInterface professionMapperInterface;

    @Override
    public Employee toEntity(EmployeeDto dto) {

        Employee entity = new Employee();

        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setSurname(dto.getSurname());
        entity.setAddress(dto.getAddress());
        entity.setProfessionId(professionMapperInterface.toEntity(dto.getProfessionId()));

        return entity;
    }

    @Override
    public EmployeeDto toDto(Employee entity) {

        EmployeeDto dto = new EmployeeDto();

        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setSurname(entity.getSurname());
        dto.setAddress(entity.getAddress());
        dto.setProfessionId(professionMapperInterface.toDto(entity.getProfessionId()));

        return null;
    }
}
