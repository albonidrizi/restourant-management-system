package RestaurantManagement.service.serviceInterface;

import RestaurantManagement.dto.TotalBillsDto;

import java.util.List;

public interface TotalBillsServiceInterface {
    List<TotalBillsDto> getAllTotalBills();
    TotalBillsDto getTotalBillsById(Integer id);
    TotalBillsDto saveTotalBills(TotalBillsDto body);
    TotalBillsDto updateTotalBills1(TotalBillsDto body);
    TotalBillsDto updateTotalBills2(TotalBillsDto body);
    TotalBillsDto deleteTotalBillsById(Integer id);
}
