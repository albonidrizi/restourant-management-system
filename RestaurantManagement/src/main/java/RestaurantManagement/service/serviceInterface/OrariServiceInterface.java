package RestaurantManagement.service.serviceInterface;


import RestaurantManagement.dto.OrariDto;

import java.util.List;

public interface OrariServiceInterface {
    List<OrariDto> getAllOrari();
    OrariDto getOrariById(Integer id);
    OrariDto saveOrari(OrariDto body);
    OrariDto updateOrari1(OrariDto body);
    OrariDto updateOrari2(OrariDto body);
    OrariDto deleteOrariById(Integer id);
}
