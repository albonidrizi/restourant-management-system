package RestaurantManagement.service;

import RestaurantManagement.dto.EmployeeDto;
import RestaurantManagement.mapper.EmployeeMapperImpl;
import RestaurantManagement.repository.EmployeeRepository;
import RestaurantManagement.service.serviceInterface.EmployeeServiceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class EmployeeServiceImpl implements EmployeeServiceInterface {


    @Autowired
    private EmployeeRepository repository;

    @Autowired
    private EmployeeMapperImpl mapper;

    @Override
    public List<EmployeeDto> getAllEmployee() {
        return repository.findAll()
                .stream().map(mapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public EmployeeDto getEmployeeById(Integer id) {
        return repository.findById(id)
                .map(mapper::toDto)
                .orElse(null);
    }

    @Override
    public EmployeeDto saveEmployee(EmployeeDto body) {
        return mapper.toDto(repository.save(mapper.toEntity(body)));
    }

    @Override
    public EmployeeDto updateEmployee1(EmployeeDto body) {
        return mapper.toDto(repository.save(mapper.toEntity(body)));
    }

    @Override
    public EmployeeDto updateEmployee2(EmployeeDto body) {
        return mapper.toDto(repository.save(mapper.toEntity(body)));
    }

    @Override
    public EmployeeDto deleteEmployeeById(Integer id) {
        EmployeeDto deleted = getEmployeeById(id);
        repository.deleteById(id);
        return deleted;
    }
}
