package RestaurantManagement.service.serviceInterface;

import RestaurantManagement.dto.BillsDto;

import java.util.List;

public interface BillsServiceInterface {

    List<BillsDto> getAllBus();
    BillsDto getBussById(Integer id);
    BillsDto saveBuss(BillsDto body);
    BillsDto updateBuss1(BillsDto body);
    BillsDto updateBuss2(BillsDto body);
    BillsDto deleteBussById(Integer id);
}
