package RestaurantManagement.controller;

import RestaurantManagement.dto.BillsDto;
import RestaurantManagement.dto.DrinkDto;
import RestaurantManagement.service.serviceInterface.BillsServiceInterface;
import RestaurantManagement.service.serviceInterface.DrinkServiceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/rms")
public class DrinkController {


    private DrinkServiceInterface service;


    @GetMapping("/getAllDrink")
    private List<DrinkDto> getAllDrink() {
        return service.getAllDrink();
    }

    @GetMapping("/getDrinkById")
    public DrinkDto getDrinkById(@Validated @RequestParam(name = "drinkId") Integer id) {
        return service.getDrinkById(id);
    }

    @GetMapping("/getDrinkByID/{id}")
    public DrinkDto getDrinkByID(@Validated @PathVariable("id") Integer id) {
        return service.getDrinkById(id);
    }


    @PostMapping("/createDrink")
    public DrinkDto saveDrink(@Validated @RequestBody DrinkDto body) {
        return service.saveDrink(body);
    }


    @PutMapping("/updateDrink1")
    public DrinkDto updateDrink1(@Validated @RequestBody DrinkDto body) {
        return service.updateDrink1(body);
    }


    @PatchMapping("/UpdateDrink2")
    public DrinkDto updateDrink2(@Validated @RequestBody DrinkDto body) {
        return service.updateDrink2(body);
    }


    @DeleteMapping("/deleteDrink")
    public DrinkDto deleteBillsById(@Validated @RequestParam(name = "drinkId") Integer id) {
        return service.deleteDrinkById(id);
    }


    @DeleteMapping("/deletebuss/{id}")
    public DrinkDto deleteBillsByID(@Validated @PathVariable("id") Integer id) {
        return service.deleteDrinkById(id);
    }

}
