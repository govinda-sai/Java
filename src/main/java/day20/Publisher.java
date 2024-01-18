package day20;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity (name = "day20.Publisher")
@Table (name = "publishers")
public class Publisher {
	@Id 
	@Column (name = "pub_id")
	private Integer pubId;
	
	@Column (name = "pub_name")
	private String pubName;
	
	@Column (name = "city")
	private String city;
	
	@Column (name = "state")
	private String state;
	
	@Column (name = "country")
	private String country;
	
	@OneToMany (cascade = CascadeType.ALL, mappedBy = "publisher")
	private List<Title> titlesList = new ArrayList<Title>();
	
	public List<Title> getTitlesList() {
		return this.titlesList;
	}
	
	public void setTitlesList(List<Title> titlesList) {
		this.titlesList = titlesList;
	}

	public Integer getPubId() {
		return pubId;
	}

	public void setPubId(Integer pubId) {
		this.pubId = pubId;
	}

	public String getPubName() {
		return pubName;
	}

	public void setPubName(String pubName) {
		this.pubName = pubName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}