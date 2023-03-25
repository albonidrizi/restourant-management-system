package RestaurantManagement.mapper.MapperInterface;

import RestaurantManagement.dto.BillsDto;
import RestaurantManagement.model.Bills;


public interface BillsMapperInterface {

    Bills toEntity (BillsDto dto);

    BillsDto toDto (Bills entity);



}
