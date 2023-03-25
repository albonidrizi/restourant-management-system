package RestaurantManagement.service.serviceInterface;

import RestaurantManagement.dto.TotalBillsDto;

import java.util.List;

public interface TotalBillsServiceInterface {
    List<TotalBillsDto> getAllBus();
    TotalBillsDto getBussById(Integer id);
    TotalBillsDto saveBuss(TotalBillsDto body);
    TotalBillsDto updateBuss1(TotalBillsDto body);
    TotalBillsDto updateBuss2(TotalBillsDto body);
    TotalBillsDto deleteBussById(Integer id);
}
