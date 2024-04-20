package in.files.binding;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="course_Enroll")
public class course {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer Id;
	private String name;
	private String Type;
	private double price;
	public Integer getId() {
		return Id;
	}
	public String getName() {
		return name;
	}
	public String getType() {
		return Type;
	}
	public double getPrice() {
		return price;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setType(String type) {
		Type = type;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	

}
