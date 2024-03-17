package in.mvc.binding;

public class user {
 private int id;
 private String name;
 private String Email;
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public String getEmail() {
	return Email;
}
public void setId(int id) {
	this.id = id;
}
public void setName(String name) {
	this.name = name;
}
public void setEmail(String email) {
	Email = email;
}
@Override
public String toString() {
	return "user [id=" + id + ", name=" + name + ", Email=" + Email + "]";
}
 


}
