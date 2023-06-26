package RestaurantManagement.service;


import RestaurantManagement.dto.DrinkDto;
import RestaurantManagement.mapper.DrinkMapperImpl;
import RestaurantManagement.repository.DrinkRepository;
import RestaurantManagement.service.serviceInterface.DrinkServiceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class DrinkServiceImpl implements DrinkServiceInterface {


    @Autowired
    private DrinkRepository repository;

    @Autowired
    private DrinkMapperImpl mapper;


    @Override
    public List<DrinkDto> getAllDrink() {
        return repository.findAll()
                .stream().map(mapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public DrinkDto getDrinkById(Integer id) {
        return repository.findById(id)
                .map(mapper::toDto)
                .orElse(null);
    }

    @Override
    public DrinkDto saveDrink(DrinkDto body) {
        return mapper.toDto(repository.save(mapper.toEntity(body)));
    }

    @Override
    public DrinkDto updateDrink1(DrinkDto body) {
        return mapper.toDto(repository.save(mapper.toEntity(body)));
    }

    @Override
    public DrinkDto updateDrink2(DrinkDto body) {
        return mapper.toDto(repository.save(mapper.toEntity(body)));
    }

    @Override
    public DrinkDto deleteDrinkById(Integer id) {
        DrinkDto deleted = getDrinkById(id);
        repository.deleteById(id);
        return deleted;
    }
}
