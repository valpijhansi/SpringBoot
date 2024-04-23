package in.restApi.binding;

public class passenger {

	private Integer id;
	private String name;
	private String doj;
	private String gender;
	private String source;
	private String destination;
	private String trainNum;
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDoj() {
		return doj;
	}
	public String getGender() {
		return gender;
	}
	public String getSource() {
		return source;
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
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public void setTrainNum(String trainNum) {
		this.trainNum = trainNum;
	}
	
	
}
