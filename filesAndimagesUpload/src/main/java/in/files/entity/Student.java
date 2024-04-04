package in.files.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="student_tbl")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Getter
	@Setter	
	private Integer id;
	 private String firstName;
	 private String lastName;
	 private String email;
	 
	 private byte[] imagedata;
	 
	 private byte[] filedata;

	public Integer getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public byte[] getImagedata() {
		return imagedata;
	}

	public byte[] getFiledata() {
		return filedata;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setImagedata(byte[] imagedata) {
		this.imagedata = imagedata;
	}

	public void setFiledata(byte[] filedata) {
		this.filedata = filedata;
	}

	

}
