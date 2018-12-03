package Test;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
		
	private List<Course> cou=new ArrayList();
		
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
}
