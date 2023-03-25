package RestaurantManagement.mapper;

import RestaurantManagement.dto.MenuTypeDto;
import RestaurantManagement.mapper.MapperInterface.MenuTypeMapperInterface;
import RestaurantManagement.model.MenuType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class MenuTypeMapperImpl implements MenuTypeMapperInterface {


    @Override
    public MenuType toEntity(MenuTypeDto dto) {
        MenuType entity = new MenuType();
        entity.setId(dto.getId());
        entity.setType(dto.getType());
        return entity;
    }

    @Override
    public MenuTypeDto toDto(MenuType entity) {
        MenuTypeDto dto = new MenuTypeDto();
        dto.setId(entity.getId());
        dto.setType(entity.getType());
        return dto;
    }
}
