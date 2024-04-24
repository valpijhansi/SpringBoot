package in.restApi.binding;

import org.springframework.boot.autoconfigure.domain.EntityScan;


public class product {
	
	private Integer id;
	private String name;
	private String price;
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getPrice() {
		return price;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	public product(Integer id, String name, String price) {
		
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	

}
