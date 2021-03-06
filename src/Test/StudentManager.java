package Test;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
	//创建学生的集合	
	private List<Student> str=new ArrayList();
	{
		Student stu=new Student("阿龙", "0001", '男', 19);
		str.add(stu);
		stu=new Student("阿虎", "0002", '男', 25);
		str.add(stu);
		stu=new Student("啊蛇", "0003", '男', 15);
		str.add(stu);
		stu=new Student("阿牛", "0004", '男', 30);
		str.add(stu);
		stu=new Student("阿猫", "0005", '男', 29);
		str.add(stu);
		stu=new Student("阿狗", "0006", '男', 11);
		str.add(stu);
		stu=new Student("阿鸡", "0007", '男', 42);
		str.add(stu);
		stu=new Student("阿龟", "0008", '男', 33);
		str.add(stu);
		
	}
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
