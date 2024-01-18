package day18.orders;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Table(name = "orders")
@Entity(name = "day18.orders.Order")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "order_id")
	private int orderId;

	@Column(name = "customer_name", length = 30)
	private String name;

	@Column(name = "order_date", length = 15)
	private LocalDate date;

//	@ElementCollection
//	@CollectionTable(name = "order_product_ids", 
//						joinColumns = @JoinColumn(name = "order_id"))
//	@Column(name = "product_ids")
//	private Set<Integer> ids = new HashSet<Integer>();

	@ElementCollection
	@CollectionTable(name = "prodid_qoh_class", joinColumns = @JoinColumn(name = "order_id"))
	@Embedded
	@Column
	private Set<ProductDetailsCollection> productDetails = new HashSet<>();

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Set<ProductDetailsCollection> getProductDetails() {
		return productDetails;
	}

	public void setProductDetails(Set<ProductDetailsCollection> productDetails) {
		this.productDetails = productDetails;
	}
}