package RestaurantManagement.service.serviceInterface;

import RestaurantManagement.dto.MenuTypeDto;

import java.util.List;

public interface MenuTypeServiceInterface {


    List<MenuTypeDto> getAllBus();
    MenuTypeDto getMenuTypeById(Integer id);
    MenuTypeDto saveMenuType(MenuTypeDto body);
    MenuTypeDto updateMenuType1(MenuTypeDto body);
    MenuTypeDto updateMenuType2(MenuTypeDto body);
    MenuTypeDto deleteMenuTypeById(Integer id);

}
