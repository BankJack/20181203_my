package Test;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
	//创建学生的集合	
	private List<Student> str=new ArrayList();
		
		/**
		 * 增加学生
		 * @param stu
		 * @return
		 */
		public boolean add(Student stu) {
			for (int i = 0; i <str.size() ; i++) {
				if(str.get(i).getIdCar().equals(stu.getIdCar())) {
					return false;
				}
			}
			boolean yesOrno=str.add(stu);
			return yesOrno;
			
		}
		
		/**
		 * 根据学号
		 * 修改学生
		 */
		public Student revamp(String idCar) {
			Student stu=this.seek(idCar);
			if(stu==null) {
				return null;
			}else {
				return stu;
			}
		}
		
		/**
		 * 删除学生
		 */
		public boolean remove(String idCar) {
			Student stu=this.seek(idCar);
			if(stu==null) {
				return false;
			}else {
				str.remove(this.seek(idCar));
				return true;
			}
		}
		
		/**
		 * 查询学生
		 * 根据学号查询
		 */
		public Student seek(String idCar) {
			for (int i = 0; i <str.size() ; i++) {
				if(str.get(i).getIdCar().equals(idCar)) {
					return str.get(i);
				}
			}
			return null;
		}
		/**
		 * 打印学生
		 */
		public void printStu() {
			for (int i = 0; i < str.size();i++) {
			System.out.println(str.get(i).toString());
			}
	}
}
