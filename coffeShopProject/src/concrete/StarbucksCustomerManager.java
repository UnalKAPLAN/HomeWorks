package concrete;

import abstracts.BaseCustomerManager;
import abstracts.CustomerCheckService;
import entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager  {
	
	CustomerCheckService checkService;
	public StarbucksCustomerManager(CustomerCheckService checkService) {
		this.checkService=checkService;
	}
	
	public void save(Customer customer) {
		if(checkService.checkIfRealPerson(customer)) {
			super.save(customer);
			
		}else {
			System.out.println("Böyle bir kullanýcý yoktur");
		}
	}

}