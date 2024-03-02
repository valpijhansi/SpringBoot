package in.data.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import in.data.entities.Project;
import in.data.repo.projectRepo;

@Service
public class projectService {
	private projectRepo repo;
	
	public projectService(projectRepo repo) {
		this.repo = repo;
		
	}
	
	public void projectSave(){
		Project p1 = new Project(101,"Lokesh",20000.00);
		Project p2 = new Project(102,"Jhansi",30000.00);
		Project p3 = new Project(103,"Rishi",40000.00);
		
		List<Project> list = Arrays.asList(p1,p2,p3);
		repo.saveAll(list);
		
		System.out.println("Records saved....");
	}
	
	
	public void findById(Integer pid) {
		Optional<Project> list1 = repo.findById(pid);
		
		if(list1.isPresent()) {
			Project project = list1.get();
			System.out.println(project);
			
		}else {
			System.out.println("Records not found...");
		}
		
		
	}
	
	public void getDetails(List<Integer> pids) {
		Iterable<Project> project = repo.findAllById(pids);
		
		project.forEach(e ->System.out.println(e));
		
	}

	
	public void callfindByMethods() {
		List<Project>list2 = repo.findBycost(20000.00);
		list2.forEach(System.out::println);
	}
}
