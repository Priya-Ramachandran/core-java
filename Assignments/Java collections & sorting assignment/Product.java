package Class;

import java.util.stream.Stream;

public class Product {
	private long productId;
	private String name;
	private String category;
	private Double price;
	
	public Product() {
		
	}

	public Product(long id, String name, String category, Double price) {
		super();
		this.productId = productId;
		this.name = name;
		this.category = category;
		this.price = price;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", category=" + category + ", price=" + price + "]";
	}

	public static Stream<Order> stream() {
		// TODO Auto-generated method stub
		return null;
	}
    
	
}
