package RestaurantManagement.mapper.MapperInterface;

import RestaurantManagement.dto.MenuTypeDto;
import RestaurantManagement.model.MenuType;

public interface MenuTypeMapperInterface {

    MenuType toEntity (MenuTypeDto dto);

    MenuTypeDto toDto (MenuType entity);

}
