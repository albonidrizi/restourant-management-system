package RestaurantManagement.service.serviceInterface;

import RestaurantManagement.dto.MenuDto;

import java.util.List;

public interface MenuServiceInterface {

    List<MenuDto> getAllMenu();
    MenuDto getMenuById(Integer id);
    MenuDto saveMenu(MenuDto body);
    MenuDto updateMenu1(MenuDto body);
    MenuDto updateMenu2(MenuDto body);
    MenuDto deleteMenuById(Integer id);

}
