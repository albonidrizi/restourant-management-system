package RestaurantManagement.controller;

import RestaurantManagement.dto.BillsDto;
import RestaurantManagement.service.serviceInterface.BillsServiceInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/rms")
public class BillsController {

    private BillsServiceInterface service;


    @GetMapping("/getAllBills")
    private List<BillsDto> getAllBills() {
        return service.getAllBills();
    }

    @GetMapping("/getBillsById")
    public BillsDto getBillsById(@Validated @RequestParam(name = "billId") Integer id) {
        return service.getBillsById(id);
    }

    @GetMapping("/getBillsByID/{id}")
    public BillsDto getBillsByID(@Validated @PathVariable("id") Integer id) {
        return service.getBillsById(id);
    }


    @PostMapping("/createBills")
    public BillsDto saveBills(@Validated @RequestBody BillsDto body) {
        return service.saveBills(body);
    }


    @PutMapping("/updateBills1")
    public BillsDto updateBill1(@Validated @RequestBody BillsDto body) {
        return service.updateBills1(body);
    }


    @PatchMapping("/UpdateBills2")
    public BillsDto updateBill2(@Validated @RequestBody BillsDto body) {
        return service.updateBills2(body);
    }


    @DeleteMapping("/deleteBills")
    public BillsDto deleteBillsById(@Validated @RequestParam(name = "billId") Integer id) {
        return service.deleteBillsById(id);
    }


    @DeleteMapping("/deleteBills/{id}")
    public BillsDto deleteBillsByID(@Validated @PathVariable("id") Integer id) {
        return service.deleteBillsById(id);
    }

    @GetMapping("billsFilter")
    public Page<BillsDto> billsFilter(@RequestParam Integer pageSize,
                                   @RequestParam Integer pageNumber,
                                   @RequestParam String sort, Boolean isAscending,
                                   @RequestParam(name = "billNo", required = false) String billNo) {
        return service.busFilter(pageSize, pageNumber, sort, isAscending, billNo);
    }
}
