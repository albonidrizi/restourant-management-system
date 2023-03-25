package RestaurantManagement.service.serviceInterface;

import RestaurantManagement.dto.MenuTypeDto;

import java.util.List;

public interface MenuTypeServiceInterface {


    List<MenuTypeDto> getAllBus();
    MenuTypeDto getBussById(Integer id);
    MenuTypeDto saveBuss(MenuTypeDto body);
    MenuTypeDto updateBuss1(MenuTypeDto body);
    MenuTypeDto updateBuss2(MenuTypeDto body);
    MenuTypeDto deleteBussById(Integer id);

}
