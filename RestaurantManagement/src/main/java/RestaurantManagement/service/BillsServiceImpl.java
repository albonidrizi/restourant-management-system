package RestaurantManagement.service;

import RestaurantManagement.dto.BillsDto;
import RestaurantManagement.mapper.BillsMapperImpl;
import RestaurantManagement.repository.BillsRepository;
import RestaurantManagement.service.serviceInterface.BillsServiceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class BillsServiceImpl implements BillsServiceInterface {


  @Autowired
  private BillsRepository repository;

  @Autowired
  private BillsMapperImpl mapper;


  @Override
  public List<BillsDto> getAllBills() {
    return repository.findAll()
            .stream().map(mapper::toDto)
            .collect(Collectors.toList());
  }


  @Override
  public BillsDto getBillsById(Integer id) {
    return repository.findById(id)
            .map(mapper::toDto)
            .orElse(null);
  }

  @Override
  public BillsDto saveBills(BillsDto body) {
    return mapper.toDto(repository.save(mapper.toEntity(body)));
  }



  @Override
  public BillsDto updateBills1(BillsDto body) {
    return mapper.toDto(repository.save(mapper.toEntity(body)));
  }

  @Override
  public BillsDto updateBills2(BillsDto body) {
    return mapper.toDto(repository.save(mapper.toEntity(body)));
  }

  @Override
  public BillsDto deleteBillsById(Integer id) {
    BillsDto deleted = getBillsById(id);
    repository.deleteById(id);
    return deleted;
  }

  @Override
  public Page<BillsDto> busFilter(Integer pageSize, Integer pageNumber, String sort, Boolean isAscending, String bill_no) {
    return null;
  }

  @Override
  public Page<BillsDto> BillsFilter(Integer pageSize, Integer pageNumber, String sort, Boolean isAscending, String bill_no) {
    return null;
  }
}
