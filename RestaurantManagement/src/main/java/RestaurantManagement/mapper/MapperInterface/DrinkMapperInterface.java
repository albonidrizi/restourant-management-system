package RestaurantManagement.mapper.MapperInterface;

import RestaurantManagement.dto.DrinkDto;
import RestaurantManagement.model.Drink;

public interface DrinkMapperInterface {



    Drink toEntity (DrinkDto dto);

    DrinkDto toDto (Drink entity);

}
