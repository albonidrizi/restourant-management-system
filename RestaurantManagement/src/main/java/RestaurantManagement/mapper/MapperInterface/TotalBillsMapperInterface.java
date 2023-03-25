package RestaurantManagement.mapper.MapperInterface;

import RestaurantManagement.dto.TotalBillsDto;
import RestaurantManagement.model.TotalBills;

public interface TotalBillsMapperInterface {

    TotalBills toEntity (TotalBillsDto dto);

    TotalBillsDto toDto (TotalBills entity);
}
