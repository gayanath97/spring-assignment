package service;

import util.CommonResponse;

public interface CustomerService {


    public CommonResponse getById(String id);

    public CommonResponse getCustomersByName(String name);

    public CommonResponse getCustomersByZipcode(String zipcode);
}
