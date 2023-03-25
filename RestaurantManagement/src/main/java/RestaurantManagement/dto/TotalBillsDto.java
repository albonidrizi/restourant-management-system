package RestaurantManagement.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class TotalBillsDto {
    private int id;
    private EmployeeDto employeeId;
    private BillsDto billsId;
    private int totalPrice;
}
