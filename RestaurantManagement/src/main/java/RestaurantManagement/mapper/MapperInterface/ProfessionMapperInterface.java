package RestaurantManagement.mapper.MapperInterface;

import RestaurantManagement.dto.ProfessionDto;
import RestaurantManagement.model.Profession;

public interface ProfessionMapperInterface {

    Profession toEntity (ProfessionDto dto);

    ProfessionDto toDto (Profession entity);
}
