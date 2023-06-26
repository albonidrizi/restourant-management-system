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


    @GetMapping("/getAllBuss")
    private List<BillsDto> getAllBills() {
        return service.getAllBills();
    }

    @GetMapping("/getBussById")
    public BillsDto getBillsById(@Validated @RequestParam(name = "bussId") Integer id) {
        return service.getBillsById(id);
    }

    @GetMapping("/getBussByID/{id}")
    public BillsDto getBillsByID(@Validated @PathVariable("id") Integer id) {
        return service.getBillsById(id);
    }


    @PostMapping("/createBuss")
    public BillsDto saveBills(@Validated @RequestBody BillsDto body) {
        return service.saveBills(body);
    }


    @PutMapping("/updateBuss1")
    public BillsDto updateBill1(@Validated @RequestBody BillsDto body) {
        return service.updateBills1(body);
    }


    @PatchMapping("/UpdateBuss2")
    public BillsDto updateBill2(@Validated @RequestBody BillsDto body) {
        return service.updateBills2(body);
    }


    @DeleteMapping("/deleteBuss")
    public BillsDto deleteBillsById(@Validated @RequestParam(name = "busId") Integer id) {
        return service.deleteBillsById(id);
    }


    @DeleteMapping("/deletebuss/{id}")
    public BillsDto deleteBillsByID(@Validated @PathVariable("id") Integer id) {
        return service.deleteBillsById(id);
    }

}
