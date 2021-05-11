package concrete;

import abstracts.BaseCustomerManager;
import abstracts.CustomerCheckService;
import entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager{
	CustomerCheckService checkService;
	public NeroCustomerManager(CustomerCheckService checkService) {
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
