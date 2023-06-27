package RestaurantManagement.service.serviceInterface;

import RestaurantManagement.dto.BillsDto;
import org.springframework.data.domain.Page;

import java.util.List;

public interface BillsServiceInterface {

    List<BillsDto> getAllBills();
    BillsDto getBillsById(Integer id);
    BillsDto saveBills(BillsDto body);
    BillsDto updateBills1(BillsDto body);
    BillsDto updateBills2(BillsDto body);
    BillsDto deleteBillsById(Integer id);

    Page<BillsDto> busFilter(Integer pageSize, Integer pageNumber, String sort, Boolean isAscending,
                             String bill_no);

    Page<BillsDto> BillsFilter(Integer pageSize, Integer pageNumber, String sort, Boolean isAscending, String bill_no);

    Page<BillsDto> billsFilter(Integer pageSize, Integer pageNumber, String sort, Boolean isAscending, int billNo);
}
