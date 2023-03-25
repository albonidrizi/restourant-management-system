package RestaurantManagement.service.serviceInterface;


import RestaurantManagement.dto.OrariDto;

import java.util.List;

public interface OrariServiceInterface {
    List<OrariDto> getAllBus();
    OrariDto getBussById(Integer id);
    OrariDto saveBuss(OrariDto body);
    OrariDto updateBuss1(OrariDto body);
    OrariDto updateBuss2(OrariDto body);
    OrariDto deleteBussById(Integer id);
}
