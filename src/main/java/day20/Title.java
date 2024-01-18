package day20;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity (name = "day20.Title")
@Table (name = "titles")
public class Title {
	@Id 
	@Column (name = "title_id") 
	private String titleId;
	
	@Column (name = "title")
	private String name; 
	
//	@Column (name = "pub_id") 
//	private int pub_id;
	
	@Column (name = "price")
	private Double price;
	
	@ManyToOne (fetch = FetchType.LAZY) 
	@JoinColumn (name = "pub_id")
	private Publisher publisher;
	
	@ManyToMany 
	@JoinTable (name = "titleauthor", 
				joinColumns = @JoinColumn (name = "title_id"), 
				inverseJoinColumns = @JoinColumn (name = "au_id"))
	private Set<Author> authorsList = new HashSet<Author>();

	public Set<Author> getAuthorsList() {
		return authorsList;
	}

	public void setAuthorsList(Set<Author> authorsList) {
		this.authorsList = authorsList;
	}

	public String getTitleId() {
		return titleId;
	}

	public void setTitleId(String titleId) {
		this.titleId = titleId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
}