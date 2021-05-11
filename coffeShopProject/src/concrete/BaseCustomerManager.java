package concrete;

import abstracts.CustomerService;
import entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{

	@Override
	public void save(Customer customer) {
		
		System.out.println("Saved To Database " + customer.getFirstName());		
	}

}