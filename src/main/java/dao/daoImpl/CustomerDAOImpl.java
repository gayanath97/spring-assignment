package dao.daoImpl;

import dao.CustomerDAO;
import entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import util.CommonResponse;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public CommonResponse getCustomer(String id) {
        CommonResponse commonResponse = new CommonResponse();
        Session currentSession = sessionFactory.getCurrentSession();
        Customer theCustomer = currentSession.get(Customer.class, id);

        commonResponse.setCustomer(theCustomer);
        commonResponse.setStatus(true);

        return commonResponse;
    }

    @Override
    public CommonResponse getCustomersByName(String name) {

        CommonResponse commonResponse = new CommonResponse();





        return commonResponse;
    }

    @Override
    public CommonResponse getCustomersByZipcode(String zipcode) {

        CommonResponse commonResponse = new CommonResponse();



        return commonResponse;
    }

    @Override
    public CommonResponse getByCsvFormat(String id) {
        return null;
    }
}
