package Test;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
public class Client {

	private static final Set<Course> Course = null;
	private static StudentManager ss=new StudentManager();
	private static CourseManager cc=new CourseManager();
	private static Scanner input=new Scanner(System.in);
	
	public static void main(String[] args) {
			print();
			while(true) {
				System.out.println("请选择");
				int num=input.nextInt();
				if(num==1) {
					add();
				}else if(num==2) {
					revampCou();
				}else if(num==3) {
					remove();
				}else if(num==4) {
					seek();
				}else if(num==5) {
					printStu();
				}else if(num==6) {
					print2();
					while(true) {
						System.out.println("请选择");
						int num2=input.nextInt();
						if(num2==1) {
							addCou();
						}else if(num2==2) {
							revampCou();
						}else if(num2==3) {
							removeCou();
						}else if(num2==4) {
							findForStudent();
						}else if(num2==5) {
							findStudentforCourse();
						}else if(num2==6) {
							addStu();
						}
						else if(num2==7) {
							removeStu();
						}else if(num2==8) {
							break;
						}
					}
				}
				else if(num==7) {
					System.out.println("谢谢使用!!!");
					break;
				}
			}
	}
		private static void print() {
			System.out.println("学生信息管理");
			System.out.println("1.增加学生");
			System.out.println("2.修改学生");
			System.out.println("3.删除学生");
			System.out.println("4.查询学生");
			System.out.println("5.打印学生");
			System.out.println("6.课程管理");
			System.out.println("7.系统退出");
		}
		
		private static void print2() {
			System.out.println("1.增加课程");
			System.out.println("2.修改课程");
			System.out.println("3.删除课程");
			System.out.println("4.通过学生学号，查询该学生选课情况");
			System.out.println("5.通过课程号，打印当前课程下面学生信息");
			System.out.println("6.添加选这门课程的学生");
			System.out.println("7.删除选择这门课程的学生");
			System.out.println("8.返回上级菜单");
		}
		/**
		 * 增加课程
		 */
		private static void addCou() {
			System.out.println("请输入课程编号");
			String id=input.next();
			System.out.println("请输入课程名称");
			String name=input.next();
			Course cou=new Course(name,id);
			System.out.println(cc.add(cou)?"增加成功":"增加失败");
		}
		/**
		 * 修改课程
		 */
		private static void revampCou() {
			System.out.println("请输入课程编号");
			String id=input.next();
			Course cou=cc.seek(id);
			if(cou==null) {
				System.out.println("输入错误!");
			}else {
				System.out.println("请输入新的课程名称");
				String name=input.next();
				cou.setName(name);
				System.out.println("修改成功");
			}
		}
		/**
		 * 删除课程
		 */
		private static void removeCou() {
			System.out.println("请输入需要删除课程的课程号");
			String id=input.next();
			boolean a =cc.remove(id);
			System.out.println(a?"删除成功":"删除失败");
		}
		
		/**
		 * 通过学生学号，查询该学生选课情况
		 */
		private static void findForStudent() {
			System.out.println("请输入需要查询学生的学号");
			String idCar=input.next();
			Student stu=ss.seek(idCar);
			if(stu==null) {
				System.out.println("输入错误");
			}else {
				List<Course> set=cc.findForStudent(stu);
			for (Course course : set) {
				System.out.println(course);
			}
			}
		}
		
		/**
		 * 通过课程号，打印当前课程下面学生信息
		 */
		private static void findStudentforCourse() {
			System.out.println("请输入课程编号");
			String id=input.next();
			Set<Student> stu=cc.findStudentforCourse(id);
			if(stu==null) {
				System.out.println("输入错误");
			}else {
				for (Student student : stu) {
					System.out.println(student);
				}
			}
		}
		
		/**
		 * 添加选这门课程的学生
		 */
		private static void addStu() {
			System.out.println("请输入需要添加课程的编号");
			String idCar=input.next();
			System.out.println("请输入需要添加学生的学号");
			String id=input.next();
			Student stu= ss.seek(id);
			boolean a =cc.addStu(idCar, stu);
			System.out.println(a?"添加成功":"添加失败");
			
		}
		/**
		 * 删除选择这门课程的学生
		 */
		private static void removeStu() {
			System.out.println("请输入需要删除课程的编号");
			String idCar=input.next();
			System.out.println("请输入需要删除学生的学号");
			String id=input.next();
			Student stu= ss.seek(id);
			boolean a =cc.removeStu(idCar, stu);
			System.out.println(a?"删除成功":"删除失败");
		}
		
		
		/**
		 * 增加学生
		 */
		private static void add() {
			System.out.println("请输入姓名");
			String name=input.next();
			System.out.println("请输入学号");
			String idCar=input.next();
			System.out.println("请输入年龄");
			int age=input.nextInt();
			System.out.println("请输入性别");
			char sex=input.next().charAt(0);
			Student stu=new Student(name, idCar, sex, age);
			boolean a=ss.add(stu);
			System.out.println(a?"增加成功":"增加失败");
		}
		
		
		/**
		 * 修改学生信息
		 */
		private static void revamp() {
			System.out.println("请输入学号");
			String idCar=input.next();
			Student stu=ss.revamp(idCar);
			if(stu==null) {
				System.out.println("输入错误!");
			}else {
				System.out.println("请输入姓名");
				String name=input.next();
				System.out.println("请输入学号");
				String idCar2=input.next();
				System.out.println("请输入年龄");
				int age=input.nextInt();
				System.out.println("请输入性别");
				char sex=input.next().charAt(0);
				stu.setAge(age);
				stu.setIdCar(idCar2);
				stu.setName(name);
				stu.setSex(sex);
				System.out.println("修改完成");
			}
		}
		/**
		 * 删除学生
		 */
		private static void remove() {
			System.out.println("请输入要删除学生的学号");
			String idCar=input.next();
			boolean a=ss.remove(idCar);
			if(a) {
				System.out.println("删除成功");
			}else {
				System.out.println("删除失败");
			}
		}
		/*
		 * 查询学生
		 */
		private static void seek() {
			System.out.println("请输入需要查询的学号");
			String idCar=input.next();
			Student stu=ss.seek(idCar);
			if(stu==null) {
				System.out.println("没有该学生");
			}else {
				System.out.println(stu.toString());
			}
		}
		/*
		 * 打印学生
		 */
		private static void printStu() {
			ss.printStu();
		}
}
