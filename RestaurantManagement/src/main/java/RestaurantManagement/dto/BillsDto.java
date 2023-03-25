package RestaurantManagement.dto;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class BillsDto {
    private int id;
    private int billNo;
    private DrinkDto drinkId;
    private MenuDto menuId;
    private MenuTypeDto menutypeId;
    private int unitePrice;
}
