package Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Course {
	
	private String name;   	//课程名称
	private String id;		//课程编号
	private Set<Student> stu=new HashSet<>();		//选课的学生的集合
	
	
	public Set<Student> getStu() {
		return stu;
	}
	public void Set(Set<Student> stu) {
		this.stu = stu;
	}
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Course [name=" + name + ", id=" + id + ", stu=" + stu + "]";
	}
	
	
	
}
