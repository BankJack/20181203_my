package Test;

import java.util.ArrayList;
import java.util.List;

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
			if(cou.get(i).equals(id)) {
				return cou.remove(cou.get(i));
			}
		}
		return false;
	}
}
