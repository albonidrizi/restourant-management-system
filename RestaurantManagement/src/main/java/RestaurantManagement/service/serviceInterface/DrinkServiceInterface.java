package RestaurantManagement.service.serviceInterface;


import RestaurantManagement.dto.DrinkDto;

import java.util.List;

public interface DrinkServiceInterface {

    List<DrinkDto> getAllBus();
    DrinkDto getBussById(Integer id);
    DrinkDto saveBuss(DrinkDto body);
    DrinkDto updateBuss1(DrinkDto body);
    DrinkDto updateBuss2(DrinkDto body);
    DrinkDto deleteBussById(Integer id);
}
