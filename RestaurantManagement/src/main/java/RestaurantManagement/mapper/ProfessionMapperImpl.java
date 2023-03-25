package RestaurantManagement.mapper;

import RestaurantManagement.dto.ProfessionDto;
import RestaurantManagement.mapper.MapperInterface.ProfessionMapperInterface;
import RestaurantManagement.model.Profession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class ProfessionMapperImpl implements ProfessionMapperInterface {
    @Override
    public Profession toEntity(ProfessionDto dto) {
        Profession entity = new Profession();
        entity.setId(dto.getId());
        entity.setProfessionName(dto.getProfessionName());

        return entity;
    }

    @Override
    public ProfessionDto toDto(Profession entity) {
        ProfessionDto dto = new ProfessionDto();
        dto.setId(entity.getId());
        dto.setProfessionName(entity.getProfessionName());

        return dto;
    }
}
