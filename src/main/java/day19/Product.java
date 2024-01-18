package day19;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity (name = "day19.Product")
@Table (name = "products")
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

	@OneToMany (cascade = CascadeType.ALL, mappedBy = "product")
	private List<Sales> productSalesList = new ArrayList<Sales>();

	public int getProdid() {
		return prodid;
	}

	public void setProdid(int prodid) {
		this.prodid = prodid;
	}

	public String getProdname() {
		return prodname;
	}

	public void setProdname(String prodname) {
		this.prodname = prodname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQoh() {
		return qoh;
	}

	public void setQoh(int qoh) {
		this.qoh = qoh;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getCatcode() {
		return catcode;
	}

	public void setCatcode(String catcode) {
		this.catcode = catcode;
	}

//	public List<Product> getProductSalesList() {
//		return productSalesList;
//	}
//
//	public void setProductSalesList(List<Product> productSalesList) {
//		this.productSalesList = productSalesList;
//	}
}