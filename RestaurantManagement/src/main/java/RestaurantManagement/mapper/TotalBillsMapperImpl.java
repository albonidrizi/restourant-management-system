package RestaurantManagement.mapper;

import RestaurantManagement.dto.TotalBillsDto;
import RestaurantManagement.mapper.MapperInterface.BillsMapperInterface;
import RestaurantManagement.mapper.MapperInterface.EmployeeMapperInterface;
import RestaurantManagement.mapper.MapperInterface.TotalBillsMapperInterface;
import RestaurantManagement.model.TotalBills;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class TotalBillsMapperImpl implements TotalBillsMapperInterface {

    private BillsMapperInterface billsMapperInterface;
    private EmployeeMapperInterface employeeMapperInterface;
    @Override
    public TotalBills toEntity(TotalBillsDto dto) {
        TotalBills entity = new TotalBills();
        entity.setId(dto.getId());
        entity.setEmployeeId(employeeMapperInterface.toEntity(dto.getEmployeeId()));
        entity.setBillsId(billsMapperInterface.toEntity(dto.getBillsId()));

        return entity;
    }

    @Override
    public TotalBillsDto toDto(TotalBills entity) {
        TotalBillsDto dto = new TotalBillsDto();
        dto.setId(entity.getId());
        dto.setEmployeeId(employeeMapperInterface.toDto(entity.getEmployeeId()));
        dto.setBillsId(billsMapperInterface.toDto(entity.getBillsId()));

        return null;
    }
}
