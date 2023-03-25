package RestaurantManagement.mapper;

import RestaurantManagement.dto.OrariDto;
import RestaurantManagement.mapper.MapperInterface.OrariMapperInterface;
import RestaurantManagement.model.Orari;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class OrariMapperImpl implements OrariMapperInterface {
    @Override
    public Orari toEntity(OrariDto dto) {
        Orari entity = new Orari();
        entity.setId(dto.getId());
        entity.setTurni(dto.getTurni());
        entity.setBy_hour(dto.getBy_hour());
        entity.setUntil_hour(dto.getUntil_hour());

        return entity;
    }

    @Override
    public OrariDto toDto(Orari entity) {

        OrariDto dto = new OrariDto();
        dto.setId(entity.getId());
        dto.setTurni(entity.getTurni());
        dto.setBy_hour(entity.getBy_hour());
        dto.setUntil_hour(entity.getUntil_hour());

        return dto;
    }
}
