package Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CourseManager {
	
	private List<Course> cou=new ArrayList();
	{	
		cou.add(new Course("语文", "001"));
		cou.add(new Course("数学", "002"));
		cou.add(new Course("英语", "003"));
		cou.add(new Course("政治", "004"));
		cou.add(new Course("体育", "005"));
	}
	/**
	 * 增加课程	
	 * @param cou1
	 * @return
	 */
	public boolean add(Course cou1) {
		Course cou2=this.seek(cou1.getId());
		if(cou1==null) {
			return false;
		}
		return cou.add(cou1);
	}
	/**
	 * 查询有没有这个课程
	 * @param id
	 * @return
	 */
	public Course seek(String id) {
		for (int i = 0; i < cou.size(); i++) {
			if(cou.get(i).equals(id)) {
				return cou.get(i);
			}
		}
		return null;
	}
	/**
	 * 删除课程
	 * @param id
	 * @return
	 */
	public boolean remove(String id) {
		for (int i = 0; i < cou.size(); i++) {
			if(cou.get(i).getId().equals(id)) {
			cou.remove(i);
			return true;
			}
		}
		return false;
	}
	
	/**
	 *通过学生号查询学生的选课 
	 * @param stu
	 * @return
	 */
	public List<Course> findForStudent(Student stu){
		 List<Course> courseList = new ArrayList<>();
		for (Course c : cou) {
		Set<Student> setStuent=c.getStu();
		for (Student s : setStuent) {
			if(s.getIdCar().equals(stu.getIdCar())) {
				courseList.add(c);
				break;
				}
			}
		}
		return courseList;
	}
	/**
	 * 通过课程号，打印当前课程下面学生信息
	 */
	public Set<Student> findStudentforCourse(String id){
		Set<Student> stuCourse=new HashSet<>();
		for (Course c : cou) {
			if(c.getId().equals(id)) {
				return c.getStu();
			}
		}
		return null;
	}
	
	/**
	 * 添加选这门课程的学生
	 */
	public boolean addStu(String id,Student stu) {
		for (Course c : cou) {
			Course course1=c;
			if(course1.getId().equals(id)) {
				Set<Student> stu1=course1.getStu();
				return stu1.add(stu);
			}
		}
		return false;
	}
	
	/**
	 * 删除选择这门课程的学生
	 */
	
	public boolean removeStu(String id,Student stu) {
		for (Course c : cou) {
			Course course1=c;
			if(course1.getId().equals(id)) {
				Set<Student>stu1=course1.getStu();
				return stu1.remove(stu);
			}
		}
		return false;
	}
}
