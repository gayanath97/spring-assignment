package dao;

import util.CommonResponse;

public interface CustomerDAO {


    public CommonResponse getCustomer(String id);

   public CommonResponse getCustomersByName(String name);

    public CommonResponse getCustomersByZipcode(String zipcode);

    public CommonResponse getByCsvFormat(String id);
}
