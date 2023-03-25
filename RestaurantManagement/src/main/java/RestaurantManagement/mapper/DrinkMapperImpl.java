package RestaurantManagement.mapper;

import RestaurantManagement.dto.DrinkDto;
import RestaurantManagement.mapper.MapperInterface.DrinkMapperInterface;
import RestaurantManagement.model.Drink;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class DrinkMapperImpl implements DrinkMapperInterface {
    @Override
    public Drink toEntity(DrinkDto dto) {
        Drink entity = new Drink();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setCodeId(dto.getCodeId());
        entity.setDesctription(dto.getDesctription());

        return entity;
    }

    @Override
    public DrinkDto toDto(Drink entity) {
        DrinkDto dto = new DrinkDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setCodeId(entity.getCodeId());
        dto.setDesctription(entity.getDesctription());

        return dto;
    }
}
