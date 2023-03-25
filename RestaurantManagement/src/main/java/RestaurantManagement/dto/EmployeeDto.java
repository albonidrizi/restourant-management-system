package RestaurantManagement.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class EmployeeDto {

    private int id;
    private String name;
    private String surname;
    private String address;
    private ProfessionDto professionId;

}
