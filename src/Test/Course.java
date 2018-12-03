package Test;

public class Course {
	
	private String name;   //课程名称
	private String id;		//课程编号
	
	
	public Course() {
		super();
	}
	public Course(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
}
