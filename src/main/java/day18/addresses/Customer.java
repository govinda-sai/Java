package day18.addresses;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table (name = "customers")
@Entity (name = "day18.addresses.Customer")
public class Customer {
	@Id 
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "id", length = 30)
	private int id;
	@Column (name = "name", length = 30)
	private String name;
	
//	@Embedded
//	private Address home;
	@Embedded
	private Address office;
	@Column (name = "mobile")
	private String mobile;
	@Column (name = "email")
	private String email;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//	public Address getHome() {
//		return home;
//	}
//
//	public void setHome(Address home) {
//		this.home = home;
//	}

	public Address getOffice() {
		return office;
	}

	public void setOffice(Address office) {
		this.office = office;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}