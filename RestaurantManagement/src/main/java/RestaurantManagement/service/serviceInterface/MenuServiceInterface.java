package RestaurantManagement.service.serviceInterface;

import RestaurantManagement.dto.MenuDto;

import java.util.List;

public interface MenuServiceInterface {

    List<MenuDto> getAllBus();
    MenuDto getBussById(Integer id);
    MenuDto saveBuss(MenuDto body);
    MenuDto updateBuss1(MenuDto body);
    MenuDto updateBuss2(MenuDto body);
    MenuDto deleteBussById(Integer id);

}
