package day21;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name = "categories")
@Entity(name="day21.Category")
public class Category {
	@Id  // primary key 
	@Column(name = "catcode")
	private String code;

	@Column(name = "catdesc")
	private String description;
	
	@OneToMany (cascade = CascadeType.ALL, mappedBy = "category")
	private List<Product> productsList = new ArrayList<>();

	public List<Product> getProductsList() {
		return productsList;
	}

	public void setProductsList(List<Product> productsList) {
		this.productsList = productsList;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
//	@PreUpdate 
//	public void beforeUpdate() {
//		System.out.println("Updating");
//		this.description = this.description.toUpperCase();
//	}

	@Override
	public String toString() {
		return String.format("%-10s %-10s\n", this.code, this.description);
	}
}