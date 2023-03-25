package RestaurantManagement.service.serviceInterface;


import RestaurantManagement.dto.ProfessionDto;

import java.util.List;

public interface ProfessionServiceInterface {
    List<ProfessionDto> getAllBus();
    ProfessionDto getBussById(Integer id);
    ProfessionDto saveBuss(ProfessionDto body);
    ProfessionDto updateBuss1(ProfessionDto body);
    ProfessionDto updateBuss2(ProfessionDto body);
    ProfessionDto deleteBussById(Integer id);
}
