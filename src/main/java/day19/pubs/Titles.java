package day19.pubs;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity (name = "day19.pubs.Titles")
@Table (name = "titles")
public class Titles {
	@Id 
	@Column (name = "title_id") 
	private String title_id;
	
	@Column (name = "title")
	private String name; 
	
	@Column (name = "type") 
	private String type;
	
//	@Column (name = "pub_id") 
//	private int pub_id;
	
	@Column (name = "price")
	private Double price;
	
	@ManyToOne (fetch = FetchType.LAZY)
	@JoinColumn (name = "pub_id")
	private Publishers publishersPubId;

	public String getTitle_id() {
		return title_id;
	}

	public void setTitle_id(String title_id) {
		this.title_id = title_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Publishers getPublishers() {
		return publishersPubId;
	}

	public void setPublishers(Publishers publishersPubId) {
		this.publishersPubId = publishersPubId;
	} 
}