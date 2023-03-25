package RestaurantManagement.dto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Time;

@Getter @Setter
public class OrariDto {
    private int id;
    private String turni;
    private EmployeeDto employeeId;
    private Time by_hour;
    private Time until_hour;
}
