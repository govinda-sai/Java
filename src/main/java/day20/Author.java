package day20;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity (name = "day20.Author")
@Table (name = "authors")
public class Author {
	@Id 
	@Column (name = "au_id")
	private String id;
	
	@Column (name = "au_lname")
	private String lname;
	
	@Column (name = "au_fname")
	private String fname;
	
	@Column (name = "phone")
	private String phone;
	
	@Column (name = "city")
	private String city;
	
	@ManyToMany (mappedBy = "authorsList")
	Set<Title> titles = new HashSet<Title>();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Set<Title> getTitles() {
		return titles;
	}

	public void setTitles(Set<Title> titles) {
		this.titles = titles;
	}
}