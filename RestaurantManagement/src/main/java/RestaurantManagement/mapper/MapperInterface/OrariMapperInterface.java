package RestaurantManagement.mapper.MapperInterface;

import RestaurantManagement.dto.OrariDto;
import RestaurantManagement.model.Orari;

public interface OrariMapperInterface {
    Orari toEntity (OrariDto dto);

    OrariDto toDto (Orari entity);
}
