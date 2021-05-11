package concrete;

import abstracts.BaseCustomerManager;
import abstracts.CustomerCheckService;
import entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager{
	
	@Override
	public void save(Customer customer) {
		
		System.out.println("Saved to databse : " + customer.getFirstName()+" " +customer.getLastName());
	}

}

