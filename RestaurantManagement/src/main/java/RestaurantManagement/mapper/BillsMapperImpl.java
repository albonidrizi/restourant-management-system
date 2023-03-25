package RestaurantManagement.mapper;

import RestaurantManagement.dto.BillsDto;
import RestaurantManagement.mapper.MapperInterface.BillsMapperInterface;
import RestaurantManagement.mapper.MapperInterface.DrinkMapperInterface;
import RestaurantManagement.mapper.MapperInterface.MenuMapperInterface;
import RestaurantManagement.mapper.MapperInterface.MenuTypeMapperInterface;
import RestaurantManagement.model.Bills;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class BillsMapperImpl implements BillsMapperInterface {

    private DrinkMapperInterface drinkMapperInterface ;
    private MenuMapperInterface menuMapperInterface;
    private MenuTypeMapperInterface menuTypeMapperInterface;

    @Override
    public Bills toEntity(BillsDto dto) {
        Bills entity = new Bills();

        entity.setId(dto.getId());
        entity.setBillNo(dto.getBillNo());
        entity.setDrinkId(drinkMapperInterface.toEntity(dto.getDrinkId()));
        entity.setMenuId(menuMapperInterface.toEntity(dto.getMenuId()));
        entity.setMenutypeId(menuTypeMapperInterface.toEntity(dto.getMenutypeId()));
        entity.setUnitePrice((dto.getUnitePrice()));

        return entity;
    }

    @Override
    public BillsDto toDto(Bills entity) {

        BillsDto dto = new BillsDto();

        dto.setId(entity.getId());
        dto.setBillNo(entity.getBillNo());
        dto.setDrinkId(drinkMapperInterface.toDto(entity.getDrinkId()));
        dto.setMenuId(menuMapperInterface.toDto(entity.getMenuId()));
        dto.setMenutypeId(menuTypeMapperInterface.toDto(entity.getMenutypeId()));
        dto.setUnitePrice(entity.getUnitePrice());

        return dto;
    }
}
