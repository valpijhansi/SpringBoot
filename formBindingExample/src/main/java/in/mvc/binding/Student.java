package in.mvc.binding;

public class Student {
	private int sid;
	private String sname;
	private String address;
	private String email;
	public int getSid() {
		return sid;
	}
	public String getSname() {
		return sname;
	}
	public String getAddress() {
		return address;
	}
	public String getEmail() {
		return email;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", address=" + address + ", email=" + email + "]";
	}
	
	
	

}
