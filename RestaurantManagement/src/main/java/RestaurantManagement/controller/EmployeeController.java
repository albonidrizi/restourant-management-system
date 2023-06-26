package RestaurantManagement.controller;

import RestaurantManagement.dto.DrinkDto;
import RestaurantManagement.dto.EmployeeDto;
import RestaurantManagement.service.serviceInterface.EmployeeServiceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/rms")
public class EmployeeController {

    private EmployeeServiceInterface service;
    @GetMapping("/getAllDrink")
    private List<EmployeeDto> getAllDrink() {
        return service.getAllEmployee();
    }

    @GetMapping("/getDrinkById")
    public EmployeeDto getEmployeeById(@Validated @RequestParam(name = "drinkId") Integer id) {
        return service.getEmployeeById(id);
    }

    @GetMapping("/getDrinkByID/{id}")
    public EmployeeDto getDrinkByID(@Validated @PathVariable("id") Integer id) {
        return service.getEmployeeById(id);
    }


    @PostMapping("/createEmployee")
    public EmployeeDto saveEmployee(@Validated @RequestBody EmployeeDto body) {
        return service.saveEmployee(body);
    }


    @PutMapping("/updateEmployee1")
    public EmployeeDto updateEmployee1(@Validated @RequestBody EmployeeDto body) {
        return service.updateEmployee1(body);
    }


    @PatchMapping("/UpdateEmployee2")
    public EmployeeDto updateEmployee2(@Validated @RequestBody EmployeeDto body) {
        return service.updateEmployee2(body);
    }


    @DeleteMapping("/deleteEmployee")
    public EmployeeDto deleteEmployeeById(@Validated @RequestParam(name = "employeeId") Integer id) {
        return service.deleteEmployeeById(id);
    }


    @DeleteMapping("/deleteEmployee/{id}")
    public EmployeeDto deleteEmployeeByID(@Validated @PathVariable("id") Integer id) {
        return service.deleteEmployeeById(id);
    }

}