package day18;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table (name = "sales")
@Entity (name = "day18.Sales")
public class Sales {
	@Id 
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name = "invno")
	private int id;
	@Column (name = "prodid")
	private int prodid;
	@Column (name = "transdate")
	private String transdate;
	@Column (name = "qty")
	private int qty;
	@Column (name = "amount")
	private double amount;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getProdid() {
		return prodid;
	}
	public void setProdid(int prodid) {
		this.prodid = prodid;
	}
	public String getTransdate() {
		return transdate;
	}
	public void setTransdate(String transdate) {
		this.transdate = transdate;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
}