package RestaurantManagement.service.serviceInterface;


import RestaurantManagement.dto.ProfessionDto;

import java.util.List;

public interface ProfessionServiceInterface {
    List<ProfessionDto> getAllBus();
    ProfessionDto getProfessionById(Integer id);
    ProfessionDto saveProfession(ProfessionDto body);
    ProfessionDto updateProfession1(ProfessionDto body);
    ProfessionDto updateProfession2(ProfessionDto body);
    ProfessionDto deleteProfessionById(Integer id);
}
