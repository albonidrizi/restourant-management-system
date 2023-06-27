package RestaurantManagement.service.serviceInterface;


import RestaurantManagement.dto.DrinkDto;
import org.springframework.data.domain.Page;

import java.util.List;

public interface DrinkServiceInterface {

    List<DrinkDto> getAllDrink();
    DrinkDto getDrinkById(Integer id);
    DrinkDto saveDrink(DrinkDto body);
    DrinkDto updateDrink1(DrinkDto body);
    DrinkDto updateDrink2(DrinkDto body);
    DrinkDto deleteDrinkById(Integer id);

    Page<DrinkDto> drinksFilter(Integer pageSize, Integer pageNumber, String sort, Boolean isAscending, String name, int codeId);
}
