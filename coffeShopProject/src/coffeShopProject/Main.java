package coffeShopProject;

import java.time.LocalDate;

import abstracts.BaseCustomerManager;
import adapters.MernisServiceAdapter;
import concrete.NeroCustomerManager;
import concrete.StarbucksCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) {
		Customer customer=new Customer(1, "Ünal", "Kaplan", 1993, "64486021966", LocalDate.of(1993,9,05));
		BaseCustomerManager customerManager=new NeroCustomerManager(new MernisServiceAdapter());
		customerManager.save(customer);
		

	}

}
