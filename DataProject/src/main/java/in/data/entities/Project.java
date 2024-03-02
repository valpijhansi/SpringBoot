package in.data.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Project {
	@Id
   int pid;
   String project_name;
   double cost;
public int getPid() {
	return pid;
}
public String getProject_name() {
	return project_name;
}
public double getCost() {
	return cost;
}
public void setPid(int pid) {
	this.pid = pid;
}
public void setProject_name(String project_name) {
	this.project_name = project_name;
}
public void setCost(double cost) {
	this.cost = cost;
}
@Override
public String toString() {
	return "Project [pid=" + pid + ", project_name=" + project_name + ", cost=" + cost + "]";
}

public Project() {
	
}
   public Project(int pid,String project_name,double cost) {
	   this.pid = pid;
	   this.project_name = project_name;
	   this.cost = cost;
   }


}
