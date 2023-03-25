package RestaurantManagement.mapper;

import RestaurantManagement.dto.MenuDto;
import RestaurantManagement.mapper.MapperInterface.MenuMapperInterface;
import RestaurantManagement.model.Menu;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class MenuMapperImpl implements MenuMapperInterface {


    @Override
    public Menu toEntity(MenuDto dto) {

        Menu entity = new Menu();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setDescription(dto.getDescription());

        return entity;
    }

    @Override
    public MenuDto toDto(Menu entity) {

        MenuDto dto = new MenuDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setDescription(entity.getDescription());

        return dto;

    }
}
