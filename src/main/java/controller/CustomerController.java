package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import service.CustomerService;
import util.CommonResponse;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/{id}")
    public CommonResponse getById(@PathVariable String id){

        return customerService.getById(id);
    }

    @GetMapping("/{name}")
    public CommonResponse getCustomersByName(@PathVariable String name){
        return customerService.getCustomersByName(name);
    }

    @GetMapping("/{zipcode}")
    public CommonResponse getCustomersByZipcode(@PathVariable String zipcode){
        return customerService.getCustomersByZipcode(zipcode);
    }

    @GetMapping("/{id}")
    public CommonResponse getByCsvFormat(@PathVariable String id){
        return customerService.getByCsvFormat(id);
    }


}
