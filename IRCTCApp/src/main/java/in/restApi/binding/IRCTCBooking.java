package in.restApi.binding;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="IRCTCBooking")
public class IRCTCBooking {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String dob;
	private String doj;
	private String start;
	private String destination;
	private String trainNum;
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDob() {
		return dob;
	}
	public String getDoj() {
		return doj;
	}
	public String getStart() {
		return start;
	}
	public String getDestination() {
		return destination;
	}
	public String getTrainNum() {
		return trainNum;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public void setStrat(String address) {
		this.start = address;
	}
	public void setDestination(String address) {
		this.destination = address;
	}
	public void setTrainNum(String trainNum) {
		this.trainNum = trainNum;
	}
	
	
	

}
