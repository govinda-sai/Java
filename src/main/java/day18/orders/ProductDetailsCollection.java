package day18.orders;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ProductDetailsCollection {
	@Column (name = "")
	private int productId;
	@Column 
	private int quantity;
	
	public ProductDetailsCollection() {}
	public ProductDetailsCollection(int productId, int quantity) {
		this.productId = productId;
		this.quantity = quantity;
	}
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}	