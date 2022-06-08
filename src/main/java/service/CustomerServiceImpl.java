package service;

import dao.CustomerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import util.CommonResponse;

@Service
public class CustomerServiceImpl implements CustomerService {


    @Autowired
    private CustomerDAO customerDAO;

    @Override
    @Transactional
    public CommonResponse getById(String id){
        return customerDAO.getCustomer(id);
    }

    @Override
    public CommonResponse getCustomersByName(String name) {
        return customerDAO.getCustomersByName(name);
    }

    @Override
    public CommonResponse getCustomersByZipcode(String zipcode) {
        return customerDAO.getCustomersByZipcode(zipcode);
    }
}
