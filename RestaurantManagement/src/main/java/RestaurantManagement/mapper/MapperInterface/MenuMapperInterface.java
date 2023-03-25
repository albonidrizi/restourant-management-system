package RestaurantManagement.mapper.MapperInterface;

import RestaurantManagement.dto.MenuDto;
import RestaurantManagement.model.Menu;

public interface MenuMapperInterface {

    Menu toEntity (MenuDto dto);

    MenuDto toDto (Menu entity);

}
