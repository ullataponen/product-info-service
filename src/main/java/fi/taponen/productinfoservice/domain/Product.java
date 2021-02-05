package fi.taponen.productinfoservice.domain;

public class Product {
	
	private String productId;
	private String name;
	
	public Product() {
	}
	
	public Product(String productId, String name) {
		super();
		this.productId = productId;
		this.name = name;
	}
	
	public String getProductId() {
		return productId;
	}
	
	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	

}
