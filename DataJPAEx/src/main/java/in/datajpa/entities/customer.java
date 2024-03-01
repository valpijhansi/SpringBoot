package in.datajpa.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class customer {
	@Id
  int cid;
  long phno;
  String pwd;
  String uname;
public int getCid() {
	return cid;
}
public long getPhno() {
	return phno;
}
public String getPwd() {
	return pwd;
}
public String getUname() {
	return uname;
}
public void setCid(int cid) {
	this.cid = cid;
}
public void setPhno(long phno) {
	this.phno = phno;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}
public void setUname(String uname) {
	this.uname = uname;
}
@Override
public String toString() {
	return "customer [cid=" + cid + ", phno=" + phno + ", pwd=" + pwd + ", uname=" + uname + "]";
}


	
	
	
}
