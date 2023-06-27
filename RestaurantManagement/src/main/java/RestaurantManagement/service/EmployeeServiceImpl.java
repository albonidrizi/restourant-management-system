package RestaurantManagement.service;

import RestaurantManagement.dto.EmployeeDto;
import RestaurantManagement.mapper.EmployeeMapperImpl;
import RestaurantManagement.model.Employee;
import RestaurantManagement.repository.EmployeeRepository;
import RestaurantManagement.service.serviceInterface.EmployeeServiceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    @Override
    public Page<EmployeeDto> employeesFilter(Integer pageSize, Integer pageNumber, String sort, Boolean isAscending, String name, String address, Integer professionId) {

        // Build the sortingOption object
        Sort sortingOption = isAscending
                ? Sort.by(sort).ascending()
                : Sort.by(sort).descending();

        // Create the pageable object using the sortingOption object and the given values
        Pageable pageable = PageRequest.of(pageNumber, pageSize, sortingOption);

        // Search for employees from the repository
        List<Employee> employeePage = repository.searchEmployees(name, address, professionId, pageable);

        // Convert the employee page to a list of EmployeeDto objects
        List<EmployeeDto> list = new ArrayList<>();
        Integer count = repository.countEmployees(name, address, professionId);

        for (Employee employee : employeePage)
            list.add(mapper.toDto(employee));

        // Return a Page object with the list of EmployeeDto objects, page information, and the total number of elements
        return new PageImpl<>(list, pageable, count);
    }

}
