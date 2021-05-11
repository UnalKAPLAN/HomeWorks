package entities;

import java.time.LocalDate;

import abstracts.Entity;


public class Customer implements Entity {
	private int id;
	private String FirstName;
	private String LastName;
	private LocalDate DateofBirth;
	private String NationalityId;
	
	public Customer(int id, String firstname, String lastname, int dateofBirt, String nationalityId, LocalDate DateofBirth) {
		super();
		this.id = id;
		this.FirstName = firstname;
		this.LastName = lastname;
		this.DateofBirth = DateofBirth;
		this.NationalityId = nationalityId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstname) {
		FirstName = firstname;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastname) {
		LastName = lastname;
	}
	public LocalDate getDateofBirth() {
		return DateofBirth;
	}
	public void setDateofBirt(int dateofBirt) {
		DateofBirth = DateofBirth;
	}
	public String getNationalityId() {
		return NationalityId;
	}
	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}


}