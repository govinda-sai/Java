package day21;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table (name = "products")
@Entity (name = "day21.Products")
@NamedQuery (name = "costly_products", query = "select p from day21.Product p where p.price > 5000")

public class Product {
	@Id 
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "prodid")
	private int prodid;
	
	@Column (name = "prodname") 
	private String prodname;
	
	@Column (name = "price")
	private double price; 
	
	@Column (name = "qoh")
	private int qoh; 
	
	@Column (name = "remarks")
	private String remarks;
	
	@Column (name = "catcode") 
	private String catcode;
	
	@ManyToOne (fetch = FetchType.LAZY) 
	@JoinColumn (name = "catcode", insertable = false, updatable = false)
	private Category category;
	
	@OneToMany (cascade = CascadeType.ALL, mappedBy = "product") 
	List<Sales> salesList = new ArrayList<>();
	
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public List<Sales> getSalesList() {
		return salesList;
	}

	public void setSalesList(List<Sales> salesList) {
		this.salesList = salesList;
	}

	public void setProdid(int prodid) {
		this.prodid = prodid;
	}

	public void setProdname(String prodname) {
		this.prodname = prodname;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setQoh(int qoh) {
		this.qoh = qoh;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public void setCatcode(String catcode) {
		this.catcode = catcode;
	}
	
	public int getProdid() {
		return prodid;
	}

	public String getProdname() {
		return prodname;
	}

	public double getPrice() {
		return price;
	}

	public int getQoh() {
		return qoh;
	}

	public String getRemarks() {
		return remarks;
	}

	public String getCatcode() {
		return catcode;
	}

	@Override 
	public String toString() {
		return String.format("%-7d %-30s %-10.2f \t %d \t %-30s %-30s", this.prodid, this.prodname, 
				this.price, this.qoh, this.remarks, this.catcode);
	}
//	@Override
//	public String toString() {
//		return "Products [prodid=" + prodid + ", prodname=" + prodname + ", price=" + price + ", qoh=" + qoh
//				+ ", remarks=" + remarks + ", catcode=" + catcode + "]";
//	}
}