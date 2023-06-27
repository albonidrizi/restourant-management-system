package RestaurantManagement.service;


import RestaurantManagement.dto.DrinkDto;
import RestaurantManagement.mapper.DrinkMapperImpl;
import RestaurantManagement.model.Drink;
import RestaurantManagement.repository.DrinkRepository;
import RestaurantManagement.service.serviceInterface.DrinkServiceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    @Override
    public Page<DrinkDto> drinksFilter(Integer pageSize, Integer pageNumber, String sort, Boolean isAscending, String name, int codeId) {

        // Ndërtoni objektin sortingOprion
        Sort sortingOption = isAscending
                ? Sort.by(sort).ascending()
                : Sort.by(sort).descending();

        // Krijoni objektin pageable duke përdorur objektin sortingOption dhe vlerat e dhëna
        Pageable pageable = PageRequest.of(pageNumber, pageSize, sortingOption);

        // Kërkojeni punëtorët nga repo
        List<Drink> drinkPage = repository.searchDrink(name, codeId, pageable);

        // Konvertoni faqen e punëtorëve në një listë të "EmployeeDto"-ve
        List<DrinkDto> list = new ArrayList<>();
        Integer count = repository.countDrink(name, codeId);

        for (Drink b : drinkPage)
            list.add(mapper.toDto(b));

        // Kthejeni një objekt "Page" me listën e "BussDto"-ve, të dhënat e faqes dhe numrin total të elementeve
        return new PageImpl<>(list,pageable,count);
    }
}
