package day19.pubs;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity (name = "day19.pubs.Publishers")
@Table (name = "publishers")
public class Publishers {
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
	
	@OneToMany (cascade = CascadeType.ALL, mappedBy = "publishersPubId")
	private List<Titles> titlesList = new ArrayList<Titles>();

	public List<Titles> getTitlesList() {
		return titlesList;
	}

	public void setTitlesList(List<Titles> titlesList) {
		this.titlesList = titlesList;
	}

	public void setPubId(Integer pubId) {
		this.pubId = pubId;
	}

	public Integer getPubId() {
		return pubId;
	}

	public void setPubId(int pubId) {
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